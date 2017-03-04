package exemploRelogio;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Relogio extends Thread {


	public void run() {
		
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		
		while ( true ) {
			System.out.println(df.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
		
	}
	
	public static void main(String[] args) {
		
		new Relogio().start();
	}
		
}