import java.util.ArrayList;

public class LeetCode {
public static void main(String[] args) {
	int[]test= {1,2,3,4};
	System.out.println(sortArrayByParity(test));
}

public static int[] sortArrayByParity(int[] A) {
	   int[]out=new int[A.length];
	//   int[]temp=null;
	   int index=0;
	    for (int i=0; i<A.length; i++){
	        if (A[i]%2==0) {
	        	out[index++]=A[i];
	        }
	    }
	    for (int i=0; i<A.length; i++){
	        if (A[i]%2==1) {
	        	out[index++]=A[i];
	        }
	    }
	    
		return out;
	}


}
