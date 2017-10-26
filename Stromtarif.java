import Tastatur.Eingabe;
import java.text.DecimalFormat;

public class Stromtarif
{
	public static void main(String[] args)
	{
		// Definition eines Formatierungsobjektes
		DecimalFormat df = new DecimalFormat("#,##0.000");
	 
		int anzahl = Eingabe.readInteger("\nAnzahl der Verbrauchsstellen (Anzahl): ");
		double verbrauch = Eingabe.readDouble("\nJahresverbrauch in kWh(verbrauch): "); 
        double abschlag = Eingabe.readDouble("\nmonatl. gezahlter Abschlagsbetrag (Abschlag): ");     
		double gründgebühr;
		double preis;
		double bereitstellungspreis;
		String tarifgruppe;
		double guthaben = 0;
		double neuerAbschlag;
        
		if(anzahl == 1)
		{
			if(verbrauch < 10000.0)
			{
				gründgebühr = 2.9;
				preis = 0.0825;
				tarifgruppe = "SmallStrom";
				bereitstellungspreis = 0;
			}
			else
			{
				gründgebühr = 2.5;
				preis = 0.0725;
				tarifgruppe = "FullStrom";
				bereitstellungspreis = 0;
			}
		}
		else
		{
			if(verbrauch < 25000.0)
			{
				gründgebühr = 2.5;
				preis = 0.0725;
				tarifgruppe = "FullStrom";
				bereitstellungspreis = 20.5;
			}
			else
			{
				gründgebühr = 2.1;
				preis = 0.0625;
				tarifgruppe = "MaxiStrom";
				bereitstellungspreis = 15;
			}
		}
		double jahresstromkosten = gründgebühr * 12 + preis * verbrauch + bereitstellungspreis * (anzahl -1);
		double zahlbetrag = jahresstromkosten - abschlag * 12;
		if(zahlbetrag < 0)
		{
			guthaben = zahlbetrag * (-1);
			zahlbetrag = 0;
		}
		neuerAbschlag = jahresstromkosten * 1.1 / 12;
		
		System.out.println(
		"\nTarifgruppe :" + tarifgruppe +
		"\nJahresstromkosten :" + df.format(jahresstromkosten) +
		"\nGuthaben :" + df.format(guthaben) +
		"\nZahlbetrag :" + df.format(zahlbetrag) +
		"\nNeuerAbschlag :" + df.format(neuerAbschlag) );
	}
}