package recursion;

public class Factorial {
	public int fact(int num) {
		  if (num <= 1) return num;
		    else 
		    	return (fact(num-1))*num;
	}	
}