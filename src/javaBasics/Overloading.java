package javaBasics;

public class Overloading {

	public static void main(String[] args) {
		
		
		
		test1("java",20.00);
	}

	public static void test1() {

	}

	public static String test1(String str) {
		return str;

	}

	public static void test1(String str, double d) {
		

	}public static void test1( double d, String str) {
		
	}

	public static void test1(String i, double d, int p) {

	}
}
