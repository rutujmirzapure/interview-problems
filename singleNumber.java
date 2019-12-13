package hackerrank;

import java.util.HashSet;

public class singleNumber {
	
	
	public static int single(int[] nums) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : nums) {
			
			if(set.contains(i)) {
				set.remove(i);
			}else {
				set.add(i);
			}
			
			}
		
		for(int i: set) {
			return i;
		}

		    return -1;
		
			
	}
	
	public static void main(String[] args) {
		
		int nums [] = {2,4,2};
		
		System.out.println("the single number is"+single(nums));
	}

}
