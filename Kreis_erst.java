import Tastatur.Eingabe;
public class Kreis
{
  public static void main(String[] args)
  {
    //  
    final double PI = 3.141592654;
	double radius = 12;
	double radius2 = radius * radius;
	double umfang = PI * radius2 *2;
	System.out.println("Radius: " + radius);
	System.out.println("Umfang: " + umfang);
  }
}