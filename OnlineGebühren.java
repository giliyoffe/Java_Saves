import Tastatur.Eingabe;
public class OnlineGebühren
{
  public static void main(String[] args)
  {
    double onlineGebühren = 0;
	int gsmtStd = Eingabe.readInteger("Online Stunden : ");
	if(gsmtStd > 20)
	{
	  onlineGebühren = (gsmtStd - 20) * 0.45 + 10;
	}
	else
	{
	  onlineGebühren = 10;
	}
	
	System.out.println("\n Online Gebühren : " + onlineGebühren);
  }
}