import Tastatur.Eingabe;
public class Menueauswahl
{
	public static void main(String[] args)
	{
	System.out.println("\n********* Menueauswahl *********\n" +
						"(1) Programm A" +
						"(2) Programm B" +
						"(3) Programm C" +
						"(4) Programm D" +

						"\n(0) Programmende" );
		int programm = Eingabe.readInteger("Ihre Auswahl: ");
		switch(programm)
		{
			case 1: System.out.println("\n---- Programm A gewählt -----\n"); break;
			case 2: System.out.println("\n---- Programm B gewählt -----\n"); break;
			case 3: System.out.println("\n---- Programm C gewählt -----\n"); break;
			case 4: System.out.println("\n---- Programm D gewählt -----\n"); break;
			case 0: System.out.println("\n---- Programmende -----\n"); break;
			default: System.out.println("\n---- Falsche Auswahl ----\n ");
		}
	}
}