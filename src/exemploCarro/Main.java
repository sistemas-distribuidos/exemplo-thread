package exemploCarro;

public class Main {

	public static void main(String[] args) {

		long init = System.currentTimeMillis();
		
		Carro c1 = new Carro("Rubinho");
		Carro c2 = new Carro("Schumacher");
		Carro c3 = new Carro("Massa");
		Carro c4 = new Carro("Alonso");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		System.out.println(init - System.currentTimeMillis());
		
	}
}
