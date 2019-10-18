import java.util.Arrays;

public class MissingNumber {
	
// missing no it is 	
	public static void main(String[] arg) {

		
		int arr1[]= {1,2,3,1,5,6,7,8,9};
		int arr2 []= {1,2,3,4,5,6,7,8,9,10};
		
		
	       int missing =MissingNo(arr1 ,arr2);
		
		   System.out.println("the missing no is = "+missing);
		   
		   duplicateNo(arr1);
		   
		   
	}
	
	public static int MissingNo(int [] arr1 , int []arr2 ){
		
		int actualSum=0;
		int expectedSum=0;
		int missingNo =0;
		for(int i=0;i<=arr1.length-1;i++) {
			
			 actualSum =actualSum + arr1[i];	 
		}
		
		for(int i=0;i<=arr2.length-1;i++) {
			
			 expectedSum = expectedSum + arr2[i];	 
		}
		
		missingNo =expectedSum - actualSum;
		
		return missingNo;
		
		
	}
	
	public static void duplicateNo(int arr1[]) {
		
		Arrays.parallelSort(arr1);
		 int size =arr1.length;
		 int duplicate =0;
		 
		 
		 for(int i=1;i<=size-duplicate;i++) {
			 
			 if(arr1[i]==arr1[i-1]) {
				 
				 for(int j=i;j<size-duplicate-1;j++) {
					 
					 arr1[j]=arr1[j+1];
					 
					 
				 }
				 
				 duplicate++;
			 }
		 }
		for(int k=0;k<size-duplicate;k++) {
		     System.out.println(arr1[k]+",");
		}
		
	}

}
