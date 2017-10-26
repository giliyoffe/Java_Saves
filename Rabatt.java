import Tastatur.Eingabe;
public class Rabatt
{
	public static void main(String[] args)
	{
		double betrag = Eingabe.readDouble("betrag: ");
		double rabatt = 0.0; 
		double endbetrag;
		System.out.println(
		"\nKennung: " + 
		"\nStammkunden = 1" +
		"\nGroßkunden = 2" +
		"\nSonstige = 3" 
		);
		int kennung = Eingabe.readInteger("\nKennung: ");
		switch(kennung)
		{
			case 1: rabatt = betrag * 0.05; 
				break;
			case 2: rabatt = betrag * 0.08; 
				break;
			case 3: rabatt = betrag * 0.0; 
				break;
			default: kennung = 0;
		}
		if(kennung != 0)
		{
			endbetrag = betrag - rabatt;
			System.out.println("\nEndbetrag: " + endbetrag + "\nRabatt: " +  rabatt);
		}
		else
		{
			System.out.println("\nKennung falsch!");
		}
	}
}