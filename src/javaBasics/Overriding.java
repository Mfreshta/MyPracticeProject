package javaBasics;

public class Overriding {

	public static void main(String[] args) {

		String str = "Dad";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		if (str.equals(rev)) {
			System.out.println("They are equal");

		} else {
			System.out.println("They are not equal");
		}
// !===Not
	
		 int i= 10;
		 int j = 15;
		 System.out.println(i-=j);//=====>i=i+j==10+15=25
	
		 
	}

}
