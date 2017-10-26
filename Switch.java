import Tastatur.Eingabe;
public class Switch
{
	public static void main(String[] args)
	{
		int zahl = Eingabe.readInteger("Bitte eine Zahl von 1 - 5 eingeben: ");
		switch(zahl)
		{
			case 1: System.out.println("Das ");
			case 2: System.out.println("ist "); break;
			case 3: System.out.println("ein ");
			case 4: System.out.println("kurzer ");
			case 5: System.out.println("Satz. ");
		}
	}
}