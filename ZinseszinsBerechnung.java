import Tastatur.Eingabe;

/**
 *
 * @author Gil Yoffe
 */
public class ZinseszinsBerechnung 
{
    public static void main(String[] args) 
    {
		char zeichen = Eingabe.readChar("Noch mal? (j/n) ");
	  do{
			

			System.out.print("   *****Zinssatzrechnung*******  ")

			double kapital = Eingabe.readDouble
			(System.out.print("Anzahlung...");

			double zinssatz = Eingabe.readDouble
			System.out.print("Jahres....");

			int jahre = Eingabe.readInteger
			(System.out.print("Laufzeit (in jahren): ");
			//berechnung und zeigen

			int zaehler = 1;
			while(zaehler <= jahre)
			{
				zaehler++;
				kapital += kapital +zinssatz / 100;
				kapital = (int)(kapital*100)/ 100.00;
				System.out.print("Kapital nach " + (zaehler+1) + "Jahren: " + kapital);
			}    
                
		} while(zeichen == 'j');
		          
    } 
}
    
