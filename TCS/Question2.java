package TCS;

import java.util.*;

public class Question2 {
	
public static String encrypt(String str, int key) {
		
		StringBuilder encStr = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				index = (index + key) % 26;
				encStr.append((char)(index + 'A'));
			}else if(Character.isLowerCase(ch)) {
				int index = ch - 'a';
				index = (index + key) % 26;
				encStr.append((char)(index + 'a'));
			}else if(Character.isDigit(ch)) {
				int index = ch - '0';
				index = (index + key ) % 10;
				encStr.append((char)(index + '0'));
			}else {
				encStr.append(ch);
			}
		}
		return encStr.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter the string to encrypt");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the encryption key ");
		int key = sc.nextInt();
		
		String encryptedStr = encrypt(str, key);
		
		System.out.println(encryptedStr);
	}

}
