
public class LunchStr4 {

	public static void main(String[] args) {
		// Concatenation
		String s1 = "Telusko" + " Java";// Can add any amount of objects
		System.out.println(s1);

		String str1 = "Telusko";
		System.out.println(str1.concat(" Ahmet"));

		String str2 = "Telusko";
		str2.concat("Java");// can add only 1 object
		System.out.println(str2);

		String s2 = "100" + 4 + 10;
		String s3 = 100 + 4 + "10";
		System.out.println("s2:" + s2 + "; " + "s3:" + s3);
		
		double d = 20.3;
		double d1= 6.5;
		//System.out.println(d.cocat(d1)); can not concat primitive type double.
			

	}
}
