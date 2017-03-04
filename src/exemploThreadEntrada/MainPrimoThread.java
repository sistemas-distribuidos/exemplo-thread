package exemploThreadEntrada;

public class MainPrimoThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		int quantidadeThread = 5000;
		int valInicial = 1;
		int valFinal = 999999;
		
		int intervalo = (valFinal-valInicial)/quantidadeThread;
		long init = System.currentTimeMillis();
		
		PrimoThread[] threads = new PrimoThread[quantidadeThread];

		// inicia todas as Threads
		for (int i = 0; i < quantidadeThread; i++) {			
			PrimoThread p = new PrimoThread(valInicial + intervalo*i , valInicial  + intervalo*(i+1));	
			p.start();
			threads[i] = p;
		}
		int totalPrimos = 0;
		// Espera todas as threads finalizarem
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
			totalPrimos +=  threads[i].getTotalPrimos();
			System.out.println(threads[i]);
		}
		long fim = System.currentTimeMillis() - init;
		System.out.println((double)fim/1000 + "s "  +  totalPrimos + " primos");
		
		
	}
	
}

