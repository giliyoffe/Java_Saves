/*
Aufgabe 1: Stromabrechnung

Zur Vorbereitung der Stromabrechnung soll ein kleines Programm geschrieben werden. Nach Eingabe der verbrauchten Kilowattstunden ist der Zahlungsbetrag zu berechnen und anzuzeigen.

Berechnet wird eine Grundgebühr von 28 €. Jede Kilowattstunde kostet 18,5 Cent. 20 Kilowattstunden sind frei. Werden weniger als 20 Kilowattstunden verbraucht, so wird nur die Grundgebühr erhoben.

http://angelika-lorenz.de/pages/ueb/pages/0103auswahl.php
*/
import Tastatur.Eingabe;
public class Stromabrechnung
{
  public static void main(String[] args)
  {
   int Kilowattstunden = Eingabe.readInteger("Ihr Verbrauch in kWh: ");
   double grundGebuer = 28.0;
   double preis = 0.185;
   double gebuehr;
   if (Kilowattstunden > 20)
   {
     gebuehr =
	  ( Kilowattstunden - 20) * preis + grundGebuer;
   }
   else
   {
     gebuehr = grundGebuer;
   }
   System.out.println( "Ihre Gebühren betragen: " + gebuehr  );
  }
  
}  