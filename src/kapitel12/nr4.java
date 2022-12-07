package kapitel12;

import java.util.Scanner;

public class nr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
double preisa =  eingabe.nextDouble();
double prozenta =  eingabe.nextDouble();
double preisb =  eingabe.nextDouble();
double prozentb =  eingabe.nextDouble();
double amager = 1*prozenta/100;
double bmager = 1*prozentb/100;
double x = preisa/amager*1;
double y = preisb/bmager*1;
System.out.println(x);
System.out.println(y);
if (preisa/amager*1>preisb/bmager*1)
	System.out.println("Packung B ist kostenwerter");
else
	System.out.println("Packung A ist preiswerter");
	}

}
