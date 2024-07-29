package Questions;

public class skipachar {
	static int i = 0;
	static String fun(String str) {
		if(i>=str.length()) {
			return "";
		}
		
		char ch = str.charAt(i);
		i++;
		
		if(ch == 'a') {
			return fun(str);
		}
		
		return ch + fun(str);
		
	}
	
	
	public static void main(String[] args) {
		String str = "baccad";
		String ans =" ";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != 'a') {
				ans = ans+ch;
				
			}
		}
		
		String s = fun(str);
		System.out.println(s);
		
	}

}
