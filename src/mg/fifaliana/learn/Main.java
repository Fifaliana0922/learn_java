package mg.fifaliana.learn;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.avance();
		car.color();
		car.vroom();
		System.out.println("La " + car.getName() + " a une puissance de " +  car.power() + " cv");
		
		System.out.println("===========//=============");
		
		Moto moto = new Moto();
		
		moto.avance();
		moto.color();
		System.out.println("La " + moto.getName() +" a une puissance de " +  moto.power() + " cv");
	}

}
