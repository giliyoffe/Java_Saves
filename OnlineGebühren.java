import Tastatur.Eingabe;
public class OnlineGeb�hren
{
  public static void main(String[] args)
  {
    double onlineGeb�hren = 0;
	int gsmtStd = Eingabe.readInteger("Online Stunden : ");
	if(gsmtStd > 20)
	{
	  onlineGeb�hren = (gsmtStd - 20) * 0.45 + 10;
	}
	else
	{
	  onlineGeb�hren = 10;
	}
	
	System.out.println("\n Online Geb�hren : " + onlineGeb�hren);
  }
}