//moro

public class Jahreszinsen
{
  public static void main(String[] args)
  { 
	int guthaben = 5_000;
	double zinsSatz = 0.075;
	double guthabenNeu = guthaben *  (1+ zinsSatz);
   
	
	System.out.println( 
		"\n Ein Guthaben von " +guthaben +
		"\n Euro wächst in einen Jahr " +
		"\n bei dem Zinssatz von " + zinsSatz +
		"\n auf " + guthabenNeu + " Euro. "  
		
		);
  
  }
}