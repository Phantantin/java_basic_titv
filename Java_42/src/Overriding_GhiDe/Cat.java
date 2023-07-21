package Overriding_GhiDe;

public class Cat extends Animal {

	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		System.out.println("Tôi là Cat. Tôi ăn cá");
	}

	@Override
	public void makeSound() {
		System.out.println("Tôi là cat. Tôi kêu meo meo");
	}
	
	
	
	

}
