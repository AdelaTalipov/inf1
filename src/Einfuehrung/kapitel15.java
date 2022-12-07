package Einfuehrung;
import java.util.Scanner;
public class kapitel15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner( System.in );
		    int zaehler, limit;

		    System.out.println( "Geben Sie den Anfangswert ein:" );
		    zaehler     = scan.nextInt();

		    System.out.println( "Geben Sie den Endwert ein:" );
		    limit     = scan.nextInt();
		    while ( zaehler <= limit )
		    {
		        System.out.println( "Zaehler ist:" + zaehler );
		        zaehler = zaehler + 1;
		      }
		      System.out.println( "Schleife beendet" );
		    }

	}



