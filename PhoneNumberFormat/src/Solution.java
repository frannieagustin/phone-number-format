import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("00-44 48 555 8361");
		sList.add("0 - 22 1985--324");
		sList.add("555372654");
		
		for(String S: sList ) {
			System.out.println(solution(S));
		}
		
	}

	public static String solution(String S) {
		System.out.println("S.length()="+S.length());
		StringBuffer sb = new StringBuffer();
		
		S = S.replaceAll("\\D", "");
		
		while(S.length()>4) {
			sb.append(S.substring(0, 3));
			sb.append("-");
			S = S.substring(3);
			
			System.out.println("sb="+sb.toString());
			System.out.println("S="+S);
			System.out.println("S.length()="+S.length());
		}
		
		if(S.length()==4) {
			sb.append(S.substring(0, 2));
			sb.append("-");
			S = S.substring(2);
		}
		
		//add remaining chars
		sb.append(S);
		
		System.out.println("formatted string="+sb.toString());
		
		return S;
	}
	
}
