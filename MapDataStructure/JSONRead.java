package Com.YSquar.MapDataStructure;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead 
{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception
	{
		Object obj =new JSONParser().parse(new FileReader("JSONExample.json"));
	
		JSONObject jo = (JSONObject) obj;
		
	Long a = (Long)jo.get("a");
	System.out.println("a : "+a);
	Map b = ((Map)jo.get("b"));
	Iterator<Map.Entry> itr = b.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry pair = itr.next();
	    System.out.println(pair.getKey() + " : "+pair.getValue());
	}
	}
}
