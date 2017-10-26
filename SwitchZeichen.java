import Tastatur.Eingabe;
public class SwitchZeichen
{
	public static void main(String[] args)
	{
		char zeichen;
		zeichen = Eingabe.readChar("Bitte geben Sie ein Buchstaben ein: ");
		switch(zeichen)
		{
			case 'A':
			case 'a': System.out.println("Buchstabe A "); break;
			case 'B':
			case 'b': System.out.println("Buchstabe B "); break;
			case 'C':
			case 'c': System.out.println("Buchstabe C "); break;
			default : System.out.println("Kenn ich nicht"); 
		}
	}
}