package Com.YSquar.URL_Validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CheckUrl 
{

	private static final String URL_REGEX ="^(?!.*[?&]term1=|.*[?&]term2=)(((https?|ftp):/\\/)|(mailto:|news:))"
            + "([%[0-9A-Fa-f]{2}A-Za-z0-9-()_.!~*';/?:@&=+$,])"
            + "+([).!';/?:,][[:blank:]])?((\\?[^?&]+=[^?&]+)?&?[^?&]+=[^?&]+)?$";
	
	private static final Pattern URL_PATTERN =Pattern.compile(URL_REGEX);
	
	public static boolean urlValidator(String url) {
		if (url == null) {
            return false;
        }
 
        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
	}

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the URL :");
	String url =sc.nextLine();
	if (urlValidator(url)) 
	{
		System.out.println("Valid");
	}
	else {
		System.out.println("Invalid");
	}
	}
	}






