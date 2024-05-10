package stringPart2;

public class StringBuffers {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		System.out.println(sb1.capacity());// initial capacity of StringBuffer is 16
		System.out.println(sb2.capacity());// initial capacity of StringBuilder is 16
		// if you append 1 character, that will be calculated as follow:
		// old capacity * 2 + 2 and this is not good for memory optimization

		// example:
		StringBuilder sb = new StringBuilder("Sachin Tendulkar");// 16 +16
		System.out.println(sb.capacity());// output==> 32 because we add directly in the constructor
		sb.trimToSize();// will remove initial capacity
		System.out.println(sb.capacity());

		// methods in Buffer & Builder
		sb.deleteCharAt(5);
		sb.append('A');
		sb.charAt(2);
		sb.reverse();
		//...
	}

}
