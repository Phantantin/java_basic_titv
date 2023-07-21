package Overriding_GhiDe;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("Tôi là dog. Tôi ăn xương");
	}

	@Override
	public void makeSound() {
		System.out.println("Tôi là dog. Tôi sủa gâu gâu");
	}
	
	

}
