package aqtpselenium;
import org.testng.annotations.Test;



public class mergetwosortedarrays {


	@Test
	public void testarray()
	{
		int [] a = {1,2,4,5,6,7};
		
		int [] b = {51,52,54};
		int [] c = {1,1,2,2,4,5,6,6,7};
		removeDuplicates(c);
		
		
		//mergeArray(a, b, a.length, b.length);
		
		System.out.println("");
		
	}
	
	int[] mergeArray(int[] a, int[] b, int lastA, int lastB) {
		
		
		return [] a;
	    
	}

	 public int[] removeDuplicates(int[] A) {
		 
		        int len=0;
		        for(int i=0; i<(A.length-1);i++)
		        {
		            while (A[i]==A[i+1])
		            {
		                i++;
		            }
		            A[len++]=A[i];
		        }
		        return A;
		    }

}
