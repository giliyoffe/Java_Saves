import Tastatur.Eingabe;
public class MondGewicht
{
   public static void main(String[] args)
  {
    double gewicht = Eingabe.readDouble("Bitte geben Sie Ihre Gewicht ein: ");
	double moonGewicht = gewicht * 0.17;
	System.out.print("Ihre Gewicht auf dem Mond ist : " + moonGewicht + " kg" );
  }
}