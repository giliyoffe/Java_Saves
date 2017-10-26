/*
 *Beispiel Variablen Definitionen und Initialisierungen
 */
 public class Variablen
 {
	public static void main(String[] args)
	{
		int value = 13_456; 					//Variablen-Definitionen und Initialisierung
		long langeZahl = 123_456_789_012_345L;  //Buchtab L anhängen!
		
		int binaer = 0b1001_1001;   //Binär-Zahl
		int hexa = 0xEFAB;  		//Hexa-Zahl
		
		double doubleZahl = 27.3849; //Beachte punkt!
		float floatZahl = 0.1234f;   //Buchstabe F anhängen!
		
		char zeichen = 'a';  //ein Zeichen in Hochkommas setzen!
		
		boolean wahrheitswert = false;  
		// Ergänzen Sie hier eine passende Anzeige aller Variablen
		System.out.println( 
		"\n Integer         : " + value + 
		"\n Binaer          : " + binaer +
		"\n Hexa            : " + hexa + 
		"\n Lange           : " + langeZahl +
		"\n Double          : " + doubleZahl +
		"\n Float           : " + floatZahl +
		"\n Char            : " + zeichen +
		"\n Boolean         : " + wahrheitswert);
	}
 }