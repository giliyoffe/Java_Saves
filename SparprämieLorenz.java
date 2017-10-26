/**
Lorenz
**/

import Tastatur.Eingabe;
public class SparprämieLorenz
{
	public static void main(String[] args)
	{
		int anzahlkinder = Eingabe.readInteger
										("Wie viel Kinder Haben Sie?: ");
		boolean verheiratet = Eingabe.readBoolean 
											("Verheiratet?: ");
		//for boolean must answer either 'true' or 'false'
		
		double prämienSatz = 0;
		if ( verheiratet )
		{
			prämienSatz = 2;
		switch ( anzahlkinder )
		{
			case 0: break;
			case 1: 
			case 2: prämienSatz += 1; break;
			case 3:
			case 4:
			case 5: prämienSatz += 2; break;
			case 6:
			case 7:
			case 8:
			case 9: prämienSatz += 3; break;
			default: prämienSatz += 4; break;
		}
		double bespielPrämie = 1000 * prämienSatz/100;
		double bespielBetrag = 1000 + bespielPrämie;
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
			 + prämienSatz + "% Sparprämie. \n"
			 + "Wenn Sie 1.000 Euro im Jahr sparen "
			 + "bekommen Sie " +  bespielPrämie
			 + " Euro Prämie. \nSie haben also "
			 + bespielBetrag + " Sparguthaben.";
		System.out.println(text);
		}
	}
}