
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,3,5,4}; 
		//3
		int[] b = {2,3,4,1,5};
		//2
		int[] c = {1,3,4,2,5};
		//3
		
		System.out.println("a="+solution(a));
		//System.out.println("b="+solution(b));
		//System.out.println("c="+solution(c));
	}

	public static int solution(int[] A) {
		int moments = 0;
		int findThis = 1;
		
		for(int k=0; k<A.length; k++) {
			System.out.println("A[k]="+A[k]);
			System.out.println("findThis="+findThis);
			
			if(A[k]==findThis){
				moments++;
				findThis=findThis+k+1;
				System.out.println("findThis="+findThis);
			}
		}
		
		System.out.println("moments="+moments);
		return moments;
	}
	
}
