package com.xworkz.abstraction;

public class JavaTrainee extends Person implements XworkzRule{

	@Override
	public boolean uploadTask() {
		System.out.println("Running UploadTaks");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("Running completedProgram");
		return false;
	}

	@Override
	String eat() {
		System.out.println("Running eat");
		return null;
	}

	@Override
	int sleep() {
		System.out.println("Running sleep");
		return 0;
	}

}
