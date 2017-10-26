import Tastatur.Eingabe;
public class StormGebühren
{
  public static void main(String[] args)
  {
    double onlineGebühren = 0;
	int gsmtStd = Eingabe.readInteger("Kilowatt Stunden : ");
	if(gsmtStd > 100)
	{
	  onlineGebühren = (gsmtStd - 100) * 0.2 + 30;
	}
	else
	{
	  onlineGebühren = 30;
	}
	
	System.out.println("\n Storm Gebühren : " + onlineGebühren);
  }
}