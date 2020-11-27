package day29polymerphism;

import java.util.Scanner;

public class AnimalTest {
	public static void getAnimalBehavior(Animal animal) {
	animal.makeSound();
	}
	public static void main(String[] args) {
		Animal animal = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Which animal behavior  do you want to listen");
		String choice = input.next();
		switch (choice) {
		
		case "dog":
			animal = new Dog();
			break;
			
		case "tiger":
			animal = new Tiger();
			break;
			default:
				System.out.println("wrong choice!!!");
				break;
		}
		
		if(animal!=null) {
		AnimalTest.getAnimalBehavior(animal);
		
	}
}
}