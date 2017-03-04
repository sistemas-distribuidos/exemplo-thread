package exemploSequencial;

public class PrimoSequencial {

	
	public static void main(String[] args) {
		
		long init = System.currentTimeMillis();
		int x1 = 1;
		int x2 = 20000000;
		
		int total = 0;
		
		for (int i = x1; i < x2; i++) {
			if ( isPrimo(i) ) 
				total++;
		}
		
		long fim = System.currentTimeMillis() - init;
		
		System.out.print((double)fim/1000 + "s - " + total + " primos ");
		
	}
	
	public static boolean isPrimo(int x) {
		
		for (int i = 2; i <= (int) Math.sqrt(x); i++) {
			if ( x % i == 0 ) return false;
		}
		return true;		
	}
}