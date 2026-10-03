package mg.fifaliana.learn;

public class Player {
	private String name;

	private double health;

	private double power;
	
	public Player(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	public void damage(double damage) {
		this.health -= damage;
	}
	
	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
