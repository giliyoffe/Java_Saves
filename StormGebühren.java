import Tastatur.Eingabe;
public class StormGeb�hren
{
  public static void main(String[] args)
  {
    double onlineGeb�hren = 0;
	int gsmtStd = Eingabe.readInteger("Kilowatt Stunden : ");
	if(gsmtStd > 100)
	{
	  onlineGeb�hren = (gsmtStd - 100) * 0.2 + 30;
	}
	else
	{
	  onlineGeb�hren = 30;
	}
	
	System.out.println("\n Storm Geb�hren : " + onlineGeb�hren);
  }
}