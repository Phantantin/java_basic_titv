package Overriding_GhiDe;

public class Bird extends Animal {

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("Tôi là Bird. Tôi ăn sâu");
	}

	@Override
	public void makeSound() {
		System.out.println("Tôi là Bird. Tôi hát");
	}
	
	

}
