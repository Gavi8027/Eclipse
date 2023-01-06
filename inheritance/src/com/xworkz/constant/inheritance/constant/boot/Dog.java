package com.xworkz.constant.inheritance.constant.boot;

import com.xworkz.constant.inheritance.constant.Animal;

public class Dog extends Animal {

	public String name = "Bedi nayi";
	public String color = "Black";

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public void Dogg() {
		System.out.println(" printing dog ");	}

	public static void main(String[] args) {
	

		Animal animal = new Animal();
		animal.name="Lion";
		System.out.println(animal.name);
		
		Dog dog = new Dog();
		System.out.println(dog.name);

		// System.out.println(animal.color);
		Animal animal1 = new Dog();
		System.out.println(animal1.color);
		
		System.out.println(dog.color);
		System.out.println();
		System.out.println();

	}

}
