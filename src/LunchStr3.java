
public class LunchStr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 8, 6, 9, 7 };
		String str = "HawaCamaraMonravia";
		System.out.println(str.toUpperCase());

		// length; property used for array length
		System.out.println(arr.length);// 6
		// length(); method used for String length
		System.out.println(str.length());// 18
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.endsWith("avia"));// true
		System.out.println(str.endsWith("a"));// true
		System.out.println(str.startsWith("wa"));// false
		System.out.println(str.substring(3, 16));// part of String (start from &ends at)
		char[] chr = str.toCharArray();
		for (char c : chr) {
			System.out.print(c + " ");
		}

	}

}
