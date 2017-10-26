import Tastatur.Eingabe;
public class JahrRechnung
{
/** This is a documentation comment */

/** This is also a
    documentation comment */

/**********************

This is the start of a method

***********************/

	public static void main(String[] args)
	{
		int jahr = Eingabe.readInteger("\nJahr : ");
		jahr = 2016 - jahr;
		if(jahr < 1000)
		{
			System.out.println(" \nEs war vor " + jahr + " Jahren" );
		}
		else
		{
			System.out.println(" \nEs war im Jahr " + jahr + "." );
		}
	}
}