package hackerrank;

public class FuzzBuzz {
	
	
	public static void main(String[] args) {
		
		int n=30;
		
		for(int i =1;i<n;i++) {
			
			if(i%3==0 && i%5 == 0) {
				
				System.out.print(" FuzzBuzz ");
			}
			else if(i%3==0){
				
				System.out.print(" fuzz ");
				
			}else if(i%5==0) {
				System.out.print(" Buzz ");
			}else {
				System.out.print(i+" ");
			}
		}
		
	}

}
