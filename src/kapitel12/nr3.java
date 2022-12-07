package kapitel12;

import java.util.Scanner;

public class nr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);

		System.out.println("tankkapizität");
		int tankkapizität = eingabe.nextInt();
		
		System.out.println("benzinanzeige");
		int benzinanzeige = eingabe.nextInt();
		
		System.out.println("Meilen pro Gallone:");

		int mpg = eingabe.nextInt();
		
		double tankfuellung = tankkapizität*benzinanzeige/100.0;
		System.out.println(tankfuellung);
		
		if (mpg*tankfuellung>=200)
			System.out.println("Weiterfahren");
		else 
			System.out.println("Tanken!");
	}

}
