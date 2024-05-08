
public class LunchStr1 {

	public static void main(String[] args) {

		// final vs Immutability
//		final String s = "Telusko";
//		System.out.println(s);
//		s = "Alien";
//		System.out.println(s);
		
		String s = "Telusko";
		System.out.println(s);
		s = "Alien";
		System.out.println(s);
		// this will not override Telusko, new object will always be create any time you change s value.
		//this not good for memory optimization
		
		

	}

}
