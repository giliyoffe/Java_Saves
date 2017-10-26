public class Zahl
{
  public static void main(String[] args)
  {
    long zahl = 214_748_364_7; //int changed to long. cuz this number is the last possible number for int.
	System.out.println( "Zahl ist: " + zahl );
	zahl = zahl + 1;
	System.out.println( "Zahl ist: " + zahl );
	zahl += 1;
	System.out.println( "Zahl ist: " + zahl );
	zahl++;
	System.out.println( "Zahl ist: " + zahl );
	
  }
}