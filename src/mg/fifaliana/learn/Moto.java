package mg.fifaliana.learn;

public class Moto extends Vehicule {

	public Moto() {
		super("moto");
	}

	@Override
	public void avance() {
		System.out.println("La moto avance");

	}

	@Override
	public int power() {
		return 40;
	}

	@Override
	public void color() {
		System.out.println("La moto a une couleur noir");
	}

}
