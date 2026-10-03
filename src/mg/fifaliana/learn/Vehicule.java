package mg.fifaliana.learn;

public abstract class Vehicule {
	private String name;
	
	public Vehicule(String name) {
		this.name = name;
	}
	
	public abstract void avance();
	public abstract int power();
	public abstract void color();
	
	public void vroom() {
		System.out.println("vroom vroom vroom");
	}

	public String getName() {
		return name;
	}
	
}
