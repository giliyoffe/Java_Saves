/**

mein
not finished but there is Lorenz's that is finished
**/


import Tastatur.Eingabe;
public class Sparprämie
{
	public static void main(String[] args)
	{
	double prämie = 0.0;
	//double jährlichen;
	boolean ledig = Eingabe.readBoolean("\nSind Sie Verheiratet? Ob Ja bitte drucken die Null (0) zifern, ob nicht, bitte drucken die Eins (1) zifern :  ");
	if (ledig == true)
	{
		prämie = 0.02;
	}
	int kinder = Eingabe.readInteger("Wie viel Kinder Haben Sie?: ");
	if(kinder > 0)
	{
		switch(kinder)
		{
			case 1: 
			case 2: prämie = 0.01; break;
			case 3:
			case 4:
			case 5: prämie = 0.02; break;
			case 6:
			case 7:
			case 8:
			case 9: prämie = 0.03; break;
			default: prämie = 0.04; break;
		}
	}
	}
	//test
	System.out.println(ledig);
	
}