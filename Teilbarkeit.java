import Tastatur.Eingabe;
public class Teilbarkeit
{
  public static void main(String[] args)
  {
   int zahl1 = Eingabe.readInteger("\nZahl 1: ");
   int zahl2 = Eingabe.readInteger("\nZahl 2: ");
   if( zahl1 >= zahl2 )
   {
     if(zahl1 % zahl2 == 0)
	 {
	   if(zahl1 == zahl2)
		 {
	       System.out.println("\nZahlen sind gleich");
	     } 
		 else
	     {
	       System.out.println("\nZahlen sind teilbar");
	     }
	 }
	 else
	 {
	   System.out.println("\nZahlen sind nicht teilbar");
	 }
   }
   else
   {
     System.out.println("\nZweite Zahl ist größer als erste Zahl");
   }

  }  
}



