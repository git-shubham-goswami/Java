package Stack;

public class main {
	public static void main(String[] args) throws Exception{
		DynamicStack s = new DynamicStack(5);
		s.push(4);
		s.push(55);
		s.push(85);
		s.push(65);
		s.push(56);
		s.push(05);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
	}
	

}
