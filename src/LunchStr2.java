
public class LunchStr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compareTo(), it compare String lexical graphically (based on the decimal
		// values of characters):
		// A = 65; B=66; C=67; D=68 E = 67; F=68; G= 69...
		// a = 97; b = 98; c = 99; d = 100; e=101; f =102 ...
		String s1 = "Hamidu";
		String s2 = "Hamidu";
		System.out.println(s1.compareTo(s2));// 0

		String str1 = "SACHINT";
		String str2 = "SACHINT";
		System.out.println(str1.compareTo(str2));// 0

		String st1 = "SAUHINT";
		String st2 = "SACHINT";
		System.out.println(st1.compareTo(st2));// U - C => 85 - 67 = 18

		String st3 = "DHONI";
		String st4 = "VIRAT";
		System.out.println(st3.compareTo(st4));// D - V => 68 - 86 = -18

	}

}
