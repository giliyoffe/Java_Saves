import Tastatur.Eingabe;
public class NettoBrutto
{
  public static void main(String[] args)
  {
    double nettoWert = Eingabe.readInteger("NettoWert: ");
	double umsatzsteuersatz = Eingabe.readDouble("Umsatzsteuersatz: ");
	double umsatzsteuer = (nettoWert * umsatzsteuersatz) / 100;
	double bruttowert = nettoWert + umsatzsteuer;
	System.out.println
	(
	"\nBruttowert      : " + bruttowert +
	"\nNettoWert       : " + nettoWert + "€" +
	"\nUmsatzsteuersatz: " + umsatzsteuersatz + "%" +
	"\nUmsatzsteuer    : " + umsatzsteuer 
	);
  }
}