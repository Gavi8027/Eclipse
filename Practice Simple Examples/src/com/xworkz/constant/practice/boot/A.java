package com.xworkz.constant.practice.boot;

public class A {
	
	void eat() {
		System.out.println("I am eating");
	}
	
}
 public class B extends A {
	
	public void main(String[] args) {
		A a=new A();
		a.eat();
		System.out.println("i am drinking");
	}

	
	

}
