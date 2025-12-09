import java.util.*;
class PG6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println(UserMainCode.matchPattern(inp));
	}
}

class UserMainCode{
	public static boolean matchPattern (String inp){
		//Pattern p = Pattern.compile("[CPT-\d{6}]");
		return inp.matches("CPT-\\d{6}");
		
	}
}