package Einfuehrung; 
import java.util.Scanner;

 

public class daltonKw40 {

 

public static void main(String[] args) {

Scanner eingabe = new Scanner(System.in);

System.out.println("Wert für n1:");

int n1 = eingabe.nextInt();

 

System.out.println("Wert für n2:");

int n2 = eingabe.nextInt();

 

System.out.println("Wert für n3:");

int n3 = eingabe.nextInt();

 

System.out.println("Wert für n4:");

int n4 = eingabe.nextInt();

 

System.out.println("Wert für n5:");

int n5 = eingabe.nextInt();

 

System.out.println("Wert für betrag:");

int betrag = eingabe.nextInt();

 

System.out.println("Wert für max:");

int max = eingabe.nextInt();

 

eingabe.close();

if(n1<0)
{
	n1=0;
	}
else 
{
	n1=1;
	}

 

// UebungenIf Programmierung fortsetzen

}

 

}