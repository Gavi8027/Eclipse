package com.xworkz.abstraction;

public class Librarian {
	
	private Readers readers;
	
	public  Librarian () {
		System.out.println("default librarian constractor");
	}

	public Librarian(Readers readers) {
		super();
		this.readers = readers;
	}
	
	public void checkmentainSilence() {
		if(readers!=null) {
			boolean mentainSilence=this.readers.mentainSilence();
			if(mentainSilence==false) {
				System.out.println("Students are good and following the library rules");
			}
			else {
				System.out.println("Students are not good and not following the library rules");
			}
		}
		
	}

}
