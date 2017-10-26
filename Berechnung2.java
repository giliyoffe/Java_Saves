public class Berechnung2
{
  public static void main(String[] args)
  {
    long wert, ergebnis;  //changed int to long - but better to just ergebnis as long define and then after the multiplication to write after the number the letter l can small or capital letter.
	wert = 5891275;
	ergebnis = wert * 14674;
	System.out.println( "\nDas Ergebnis lautet; " + ergebnis);
	
  }
}

// the other way
/*
public class Berechnung2
{
  public static void main(String[] args)
  {
    int wert;
	long ergebnis; 
	wert = 5891275;
	ergebnis = wert * 14674L;
	System.out.println( "\nDas Ergebnis lautet; " + ergebnis);
	
  }
}
*/