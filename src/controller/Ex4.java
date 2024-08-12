package controller;

public class Ex4 {
	public Ex4() {
		super();
	}
	
	
	public int fatorialduplo(int n, int inicio) {
		if( inicio == n) {
			return inicio;
		} 
		return inicio * fatorialduplo(n, inicio + 2);
		
		
	}
}
