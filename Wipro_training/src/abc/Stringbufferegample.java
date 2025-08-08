package abc;

public class Stringbufferegample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello all here");
//		sb=sb2.append("welcome");
//		sb=sb.replace(1, 5, "hello");
//		sb.charAt(2);
		sb.insert(2, "abc");
		System.out.println(sb);
		
	}
}