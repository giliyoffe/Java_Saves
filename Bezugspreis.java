import Tastatur.Eingabe;
import java.text.DecimalFormat;
public class Bezugspreis
{
  public static void main(String[] args)
  {
    DecimalFormat df = new DecimalFormat("#,##0.00 Euro");
    double listeneinkaufspreis = Eingabe.readDouble("Bitte, Geben Sie den Listeneinkaufspreis ein: ");
	double liefererrabatt = listeneinkaufspreis * 0.10;
	double rechnungspreis = listeneinkaufspreis - liefererrabatt;
	double liefererskonto = rechnungspreis * 0.02;
	double bareinkaufspreis = rechnungspreis - liefererskonto;
	double bezugskosten = 50;
	double bezugspreis = bareinkaufspreis + bezugskosten;
	
	System.out.println
	("\nDer Bezugspreis (Einstandspreis) lautet    : " + df.format(bezugspreis)	);
     
  }
}