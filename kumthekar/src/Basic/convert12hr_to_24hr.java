package Basic;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class convert12hr_to_24hr {
	public static void main(String[] args) throws ParseException{
		System.out.print(Time("03:05:57 PM"));
	}
	
	public static String Time(String input) throws ParseException{
		//input ghetoy
		DateFormat dateformat = new SimpleDateFormat("hh:mm:ss aa");
		//24hr convert
		DateFormat format= new SimpleDateFormat("HH:mm:ss ");
		Date time = null;
	    String output = "";
	    time = dateformat.parse(input);
	    output = format.format(time);
	    return output;
	}
}
