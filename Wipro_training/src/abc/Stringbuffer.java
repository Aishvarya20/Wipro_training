package abc;

public class Stringbuffer {

	public static void main(String[] args) {
//		StringBuffer sb= new StringBuffer();
//		sb.append("Item : coffee\n ");
//		sb.append("Price : 20]n ");
//		sb.append("Item : Tea\n");
//		sb.append("Price : 20\n");
//		sb.append("Total : 40\n");
//		sb.insert(0," RECEIPT");
//		sb.append("Thank you\n");
//		System.out.println(sb.length());
//
//	}
		StringBuffer sb= new StringBuffer();
		sb.append("employee profile report");
		sb.append("Name : ab\n");
		sb.append("ID : 289\n");
		sb.append("DEP : sales\n");
		sb.append("Salary : 500000\n");
		sb.append("Report generated\n");
		
		
		StringBuffer secondemployee= new StringBuffer();
		sb.append("employee profile report\n");
		sb.append("Name : john\n");
		sb.append("ID : 345\n");
		sb.append("DEP : Marketing\n");
		sb.append("Salary : 240000\n");
		sb.append("Report generated");
		
		sb.insert(sb.length(),secondemployee);
		
		
		System.out.println(sb.toString());
		
}
}
