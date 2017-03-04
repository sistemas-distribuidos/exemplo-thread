package exemploThreadSimples;

public class Main {
	public static void main(String args[]) {
		for ( int a = 0; a < 5; a++ ) {
			MinhaThread mt = new MinhaThread();
			mt.start();
		}
	}
}
