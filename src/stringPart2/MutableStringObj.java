package stringPart2;

public class MutableStringObj {

	public static void main(String[] args) {

		// immutable String is about Object not changeable in the memory. Not about
		// final
		// Mutable String Object is an object that can be changed.
		// To manage mutable Sting object, Java provides 2 classes:
		// #1==> StringBuilder; #2==> StringBuffer we can append a string

		// StringBuilder sb= "Telusko"; // this way is invalid; you have to use new
		// keyword.
		StringBuilder sbl = new StringBuilder("Ahmet");
		System.out.println(sbl);

		StringBuffer sbf = new StringBuffer("Ayoub");
		System.out.println(sbf);
		sbf.append(" Camara");
		System.out.println(sbf);// same object is changed no new object has been created
		// this proved that it is a mutable string, using StringBuffer

		StringBuilder sbl1 = new StringBuilder("Ayoub");
		System.out.println(sbl1);
		sbl1.append(" Camara ");
		System.out.println(sbl1);// same object is changed no new object has been created
		// this proved that it is a mutable string, using StringBuilder

		// concat() can add only integer data type.
		// StringBuuilder has multiple methods & can appends multiple data types
		sbl1.append(100);
		System.out.println(sbl1);// Youb Camara 100

	}

}
