package hackerrank;

public class xToPowerN {
	
	public static void main(String[] args) {
		xToPowerN tango = new xToPowerN ();
		
		tango.mypow(2.34 , 9);
	}
	double mypow(double n ,int x) {
		
		long  N=0;
		
		if(N<0) {
			x=1/x;
			N=-N;
		}
		double ans =1;
		
		for(long  i=0;i<n;i++) {
			
			ans = ans * x;
		
		}
		return ans;
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
