package Questions;

public class skipAnString {
	
	static String skip(String str, String extra) {
		int n = extra.length();
		if(str.isEmpty()) {
			return "";
		}
		
		if(str.startsWith(extra)) {
			return skip(str.substring(n),extra);
		}else {
			return str.charAt(0)+ skip(str.substring(1),extra);
		}
	}
	
	static String skipAppNotApple(String str, String extra) {
		int n = extra.length();
		
		if(str.isEmpty()) {
			return "";
		}
		
		if(str.startsWith(extra) && !str.startsWith("apple")) {
			return skipAppNotApple(str.substring(n),extra);
		}else {
			return str.charAt(0) + skipAppNotApple(str.substring(1),extra);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		String str = "apple, app, orange, bannana";
		String s = skipAppNotApple(str,"app");
		
		
		System.out.println(s);
	}

}
