package phase1_assisted_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_Ex {
	

		public static void main(String[] args) {

			String pattern = "[A-Z]+";
			String check = "Regular Expressions";
			Pattern p = Pattern.compile(pattern);
			Matcher c = p.matcher(check);
			
			while (c.find())
		      	System.out.println( check.substring( c.start(), c.end() ) );
			}
		}



