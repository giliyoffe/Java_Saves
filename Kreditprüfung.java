import Tastatur.Eingabe;
public class KreditPrüfung
{
	public static void main(String[] args)
	{
		double eigenKapital = Eingabe.readDouble("\nEigenkapital: ");
		double immobilienWert = Eingabe.readDouble("\nImmobilienwert: ");
		if(eigenKapital <= immobilienWert * 0.3 )
		{
		  if(eigenKapital == immobilienWert * 0.3 )
		  {
			System.out.println("\nBeratung wahrnemen.");
		  }
		  else
		  {
			System.out.println("\nKredit wird nicht gewährt!");
		  }
		}
		else
		{
		  System.out.println("\nZusage");
		}
	}
}