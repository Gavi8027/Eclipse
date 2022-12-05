package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.Librarian;
import com.xworkz.abstraction.Readers;

public class LibrarianRunner {

	public static void main(String[] args) {

		
		Readers readers=new Readers();
		Librarian  librarian =new   Librarian(readers);
		 librarian.checkmentainSilence();
	}
}
				 
		

