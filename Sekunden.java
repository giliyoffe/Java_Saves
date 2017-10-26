public class Sekunden
{
  public static void main(String[] args)
  {
    final short MINUTE = 60;
	short stunde = 60 * MINUTE;
	int tag = 24 * stunde;
	int woche = 7 * tag;
	int monat = 30 * tag;
	int jahr = 12 * monat;
	/*the original with the problem to calculate int and long:
	 *long jahrhundert = 100 * jahr;	//3110400000
	 */
	//one solution:added L after 100
	//long jahrhundert = 100L * jahr;	//3110400000
	//other way is: add (long) before jahr
	long jahrhundert = 100 * (long)jahr; //3110400000	
	
	
	
	// Ergänzen Sie hier eine passende Anzeige aller Variablen
		System.out.println( 
		"\n Minute         : " + MINUTE + 
		"\n Stunde         : " + stunde +
		"\n Tag            : " + tag + 
		"\n Woche          : " + woche +
		"\n Monat          : " + monat +
		"\n Jahr           : " + jahr +
		"\n Jahrhundert    : " + jahrhundert );
  }
}