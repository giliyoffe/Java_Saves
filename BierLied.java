/**
  * Aus "Java von Kopf bis Fu�"
  * von Kathy Sierra & Bert Bates
  */
public class BierLied
{
  public static void main(String[] args)
  {
     int bierAnzahl = 99;
     String wort = "Flaschen";
     while(bierAnzahl > 0)
     {
        if (bierAnzahl > 1) wort = "Flasche";
        System.out.println(bierAnzahl + " " +  wort + " Bier im K�hlschrank.\n" +
                           bierAnzahl + " " + wort + " Bier. Hol eine raus. " +
                           "Und lass sie rum gehen.");
		bierAnzahl -= 1;
			if(bierAnzahl >= 1)
			{
			System.out.println(bierAnzahl + " " +  wort + " Bier im K�hlschrank.");
			}
        if (bierAnzahl == 0)
            System.out.println("Kein Bier im K�hlschrank.");
     }
  }
}