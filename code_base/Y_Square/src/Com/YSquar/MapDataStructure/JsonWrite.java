package Com.YSquar.MapDataStructure;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class JsonWrite {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jo = new JSONObject();
		jo.put("a", 1);
		Map m = new LinkedHashMap(2);
		m.put("c", 2);
		m.put("d", 3);
		
		jo.put("b", m);
	
	
		PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(jo.toJSONString());
        System.out.println(jo.toString());
        pw.flush();
        pw.close();
	}

}
