/**

mein
not finished but there is Lorenz's that is finished
**/


import Tastatur.Eingabe;
public class Sparpr�mie
{
	public static void main(String[] args)
	{
	double pr�mie = 0.0;
	//double j�hrlichen;
	boolean ledig = Eingabe.readBoolean("\nSind Sie Verheiratet? Ob Ja bitte drucken die Null (0) zifern, ob nicht, bitte drucken die Eins (1) zifern :  ");
	if (ledig == true)
	{
		pr�mie = 0.02;
	}
	int kinder = Eingabe.readInteger("Wie viel Kinder Haben Sie?: ");
	if(kinder > 0)
	{
		switch(kinder)
		{
			case 1: 
			case 2: pr�mie = 0.01; break;
			case 3:
			case 4:
			case 5: pr�mie = 0.02; break;
			case 6:
			case 7:
			case 8:
			case 9: pr�mie = 0.03; break;
			default: pr�mie = 0.04; break;
		}
	}
	}
	//test
	System.out.println(ledig);
	
}