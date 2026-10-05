package mg.fifaliana.learn;

public class Car extends Vehicule implements Capot {
	private boolean capot = true;

	public Car() {
		super("Voiture");
	}

	@Override
	public void avance() {
		System.out.println("La voiture avance bien");
	}

	@Override
	public int power() {
		return 110;
	}

	@Override
	public void color() {
		System.out.println("La voiture a une couleur rouge");
	}

	@Override
	public boolean haveCapot() {
		return capot;
	}

}
