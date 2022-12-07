package kapitel12;

import java.util.Scanner;

public class nr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int schraubenkosten = 5;
int mutter = 3;
int unterlegescheibe = 1;
Scanner eingabe = new Scanner(System.in);

System.out.println("Anzahl Schrauben:");
int schrauben = eingabe.nextInt();
System.out.println("Anzahl Muttern:");
int anzahlmuttern = eingabe.nextInt();
System.out.println("anzahlunterlegscheiben:");
int anzahlunterlegscheiben = eingabe.nextInt();
eingabe.close();
if (schrauben<anzahlmuttern)
	System.out.println("Die Bestellung ist okay!");
else
	System.out.println("Kontrollieren Sie Ihre Bestellung!");
System.out.println("Gesamtbetrag: schrauben*schruabenkosten+anzahlmuttern*mutter+unterlegescheibe*anzahlunterlegscheiben");
	}
}
