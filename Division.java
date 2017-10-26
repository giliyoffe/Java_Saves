import Tastatur.Eingabe;
public class Division
{
	public static void main(String[] args)
	{
		int zahl1 = Eingabe.readInteger("1. Zahl: ");
		int zahl2 = Eingabe.readInteger("2. Zahl: ");
		double ergebnis = 0.0;
		switch ( zahl2)
		{
			case 0: System.out.println
					("Division durch Null nicht erlaubt!");
					break;
			case 1: ergebnis = zahl1;
					break;
			case -1: ergebnis = -1 * zahl1;
					break;
			default: ergebnis = (double)zahl1 / zahl2;
		}
		System.out.println(ergebnis);
	}
}