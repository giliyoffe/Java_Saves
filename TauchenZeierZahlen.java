import Tastatur.Eingabe;
public class TauchenZeierZahlen
{
  public static void main(String[] args)
  {
    int zahl1 = Eingabe.readInteger("\nZahl 1 : ");
	int zahl2 = Eingabe.readInteger("\nZahl 2 : ");
	if (zahl1 < zahl2)
	{
	  int temp = zahl1;
	  zahl1 = zahl2;
	  zahl2 = temp;
	}
	System.out.println("\nZahl1 " + zahl1 + " ist groesser als Zahl2 " + zahl2);
  }
  
}