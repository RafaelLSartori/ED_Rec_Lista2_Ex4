package controller;

public class Ex4 {
	public Ex4() {
		super();
	}
	
	
	public int fatorialduplo(int n) {
		if( n == 0 || n == 1) {
			return 1;
		} 
		return n * fatorialduplo(n - 2);	
		
	}
}
