import Tastatur.Eingabe;
public class SchraubenVerkaufspreis
{
	public static void main(String[] args)
	{
		double gewicht = Eingabe.readDouble("\nSchrauben Gewicht: ");
		double preis = 0;
		if(gewicht < 100)
		{
			preis = gewicht * 1.8;
		}
		else
		{
		 if(gewicht < 300)
		  {
			preis = gewicht * 1.55;
		  }
		 else
		 {
			if(gewicht < 500)
			{
			preis = gewicht * 1.36;
			}
			else
			{
				if(gewicht < 700)
				{
					preis = gewicht * 1.05;
				}
				else
				{
					if(gewicht < 900)
					{
						preis = gewicht * 1.02;
					}
					else
					{
						preis = gewicht * 0.09;
					}
				}
			}
		  
		 }
		}
		System.out.println("\nDer Preis ist: " + preis);
	}
}