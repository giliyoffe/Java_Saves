/**
Lorenz
**/

import Tastatur.Eingabe;
public class Sparpr�mieLorenz
{
	public static void main(String[] args)
	{
		int anzahlkinder = Eingabe.readInteger
										("Wie viel Kinder Haben Sie?: ");
		boolean verheiratet = Eingabe.readBoolean 
											("Verheiratet?: ");
		//for boolean must answer either 'true' or 'false'
		
		double pr�mienSatz = 0;
		if ( verheiratet )
		{
			pr�mienSatz = 2;
		switch ( anzahlkinder )
		{
			case 0: break;
			case 1: 
			case 2: pr�mienSatz += 1; break;
			case 3:
			case 4:
			case 5: pr�mienSatz += 2; break;
			case 6:
			case 7:
			case 8:
			case 9: pr�mienSatz += 3; break;
			default: pr�mienSatz += 4; break;
		}
		double bespielPr�mie = 1000 * pr�mienSatz/100;
		double bespielBetrag = 1000 + bespielPr�mie;
		String text = "Sie haben "
		+ anzahlkinder + " Kinder und sind ";
		if ( verheiratet )
		{
			text += "verheiratet.\n";
		}
		else
		{
			text += "nicht verheiratet.\n";
		}
		text += "Sie erhalten "
			 + pr�mienSatz + "% Sparpr�mie. \n"
			 + "Wenn Sie 1.000 Euro im Jahr sparen "
			 + "bekommen Sie " +  bespielPr�mie
			 + " Euro Pr�mie. \nSie haben also "
			 + bespielBetrag + " Sparguthaben.";
		System.out.println(text);
		}
	}
}