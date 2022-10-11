package com.xworkz.things.boot;

import com.xworkz.things.Song;

public class SongRunner {
	
	public static void main(String[] args) {

		Song Song1=new Song();
		System.out.println(Song1.name);
		System.out.println(Song1.language);
		System.out.println(Song1.singer);
		System.out.println(Song1.lyrics);
		
		Song1.name="Ra Ra Rakkamma";
		Song1.language="Kannada";	
		Song1.singer="Nakash Aziz";
		Song1.lyrics="Kannada";
		
		System.out.println(Song1.name);
		System.out.println(Song1.language);
		System.out.println(Song1.singer);
		System.out.println(Song1.lyrics);
		
		
		
}
}