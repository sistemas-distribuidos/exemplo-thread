package exemploCarro;
public class Carro extends Thread {

	public Carro(String name) {
		setName(name);
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep((long) (100 * Math.random()));
				System.out.println(getName() + " correndo...");
			} catch (InterruptedException e) {
			}
		}

		System.out.println(getName() + " chegou");

	}

}