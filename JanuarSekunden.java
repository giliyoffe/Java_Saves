/*
Aufgabe 6

Schreiben Sie ein Programm, dass die Anzahl von Sekunden im Monat Januar berechnet.

http://angelika-lorenz.de/pages/ueb/pages/0102operatoren.php
*/


public class JanuarSekunden
{
  public static void main(String[] args)
  {
    final short MINUTE = 60;
	short stunde = 60 * MINUTE;
	int tag = 24 * stunde;
	int woche = 7 * tag;
	int januar = 31 * tag;
	System.out.println( 
		"\n Anzahl von Sekunden im Monat Januar      : " + januar + " Sekunden");
  
  }
}