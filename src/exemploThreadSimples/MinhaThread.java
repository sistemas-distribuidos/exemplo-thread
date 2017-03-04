package exemploThreadSimples;

public class MinhaThread extends Thread {
	
	public void run()  {
		for ( int a = 0; a < 10000;a++) {
			System.out.println(a);
		}
	}
}
