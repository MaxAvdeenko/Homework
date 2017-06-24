package edu;

import com.Cats;

public class TheCat {

	public static void main(String[] args) {
		Cats jonny = new Cats();
		jonny.init("Джонни","Male", "black", 10);
		jonny.meow();
		System.out.print( jonny.getDescription() );
	}

}
