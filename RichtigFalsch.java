  public class RichtigFalsch
 {
   public static void main(String[] args)
   {
     /*
	 final long KONSTANTE = 45;  //(1)
	 char zeichen1 = 'W';   //(2)
	 char zeichen2 = '\'';  //(3)  \ shows the ' and doesnt end the line. will do same for ".
	 //char zeichen3 = '\u00dfe'; //original:char zeichen3 = '\6a'; - Darstellung eines Zeichens durch Unicode (\u = kommt Unicode) 
	 String wort = "Stra\u00dfe";
	 */
	 // int variable shows the unicode-z.b. a shows 97 
	 int zahl1 = 'a';
	 char  zeichen4 = 97;
	//(6)2.5 is double - so we put (int) before the 2.5
	int zahl2 = (int)2.5;
	// (7)we changed the 2.5 to 2 - for int cuz 2.5 is double
	 int zahl3 = 2;
	 //(8) changed at the int to long and at the end of the number put a L(added _ for ease of reading)
	 long zahl4 = 100_000_000_000L;
	 //(9) kein fehler
	 double flaeche = 2.7;
     //(10) added f at end of number 
	 float wert = 12345.12345f;
	 //(11) after the = was a 1 - can only be true or false
	 boolean istDasWahr = true;
	 
	 
	 System.out.print(zahl2);
   }
 }