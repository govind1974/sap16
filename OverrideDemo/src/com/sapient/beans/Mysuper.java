package com.sapient.beans;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Mysuper {

	public static void display() {
		System.out.println("super");
	}

}

class Mysub extends Mysuper {
	public static void display() {
		System.out.println("sub");
	}

}