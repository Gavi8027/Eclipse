package com.xworkz.constant.practice.boot;

import jdk.internal.dynalink.beans.StaticClass;

public class Voting {

	static void voter() throws ElectionException {

		int age = 23;
		if (age > 22) {
			System.out.println("u are eligible to vote");
		}

		else {
			throw new ElectionException("cannot vote");
		}

	}

	public static void main(String[] args) {
		try {
			voter();

		} catch (ElectionException e) {
			System.out.println(e.getMessage());
		}
	}

}

class ElectionException extends Exception {
	public char[] getMessage;
	String msg;

	ElectionException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;

	}

}
