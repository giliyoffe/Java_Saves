import Tastatur.Eingabe;
public class SchaltJahresProblem
{
  public static void main(String[] args)
  {
    long jahreszahl = Eingabe.readInteger("\nJahreszahl: ");
	String text;
	if(jahreszahl % 100 == 0)
	{
	  if(jahreszahl % 400 == 0)
	  {
	    text = "Es ist ein Schaltjahr.";
	  }
	  else
	  {
	    text = "Es ist nicht ein Schaltjahr.";
	  }
	}
    	
	else  
	{
	 if(jahreszahl % 4 == 0)
	 {
		 text = "Es ist ein Schaltjahr.";
	 }
	 else
	 {
	    text = "Es ist nicht ein Schaltjahr.";
	 }
	}
	System.out.print(text);
  }
}