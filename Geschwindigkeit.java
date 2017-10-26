import Tastatur.Eingabe;
public class Geschwindigkeit
{
  public static void main(String[] args)
  {
    int geschwindigkeit = Eingabe.readInteger("Geschwindigkeit: ");
	if(geschwindigkeit > 100 )
	{
	  System.out.println("\nZu schnell gefahren.");
	  
	  if (geschwindigkeit >= 130)
	  {
	    System.out.println("\nPunkte in Flensburg");
	  }
	  else
	  {
	   System.out.println("\nVerwarnungsgeld");
	  }
	}
	else
	{
	  System.out.println("\nGeschwindigkeit war OK.");
	}
  }
}