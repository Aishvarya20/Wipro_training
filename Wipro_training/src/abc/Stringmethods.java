package abc;

public class Stringmethods {

	public static void main(String[] args) {
		String str = "welcome to java programming";
		String str2= "hello all";
		String str3 = " ";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.concat (str2));
		System.out.println(str.equals(str2));
		System.out.println(str.charAt(2));
		System.out.println(str.substring(0,2));
		System.out.println(str.startsWith("w"));
		System.out.println(str2.contains("to"));
		System.out.println(str.replace("welcome", "hello"));
		System.out.println(str.endsWith("all"));
		System.out.println(str.lastIndexOf(str2));
		System.out.println(str2.isEmpty());
		System.out.println(str3.isBlank());
		System.out.println(str.matches(str2));
		System.out.println(str.replaceAll("good afternoon","welcome to java programmin"));
		System.out.println(str2.trim());
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
