import Tastatur.Eingabe;
public class Pr�fungsergebnis
{
  public static void main(String[] args)
  {
    int noteA = Eingabe.readInteger("Note A : ");
	int noteB = Eingabe.readInteger("Note B : ");
	int noteWahlfach = Eingabe.readInteger("Note Wahlfach : ");
	double durchschnitt = (noteA + noteB + noteWahlfach) / 3.0 ;
	if(durchschnitt < 4.5 && noteA < 4)
	{
	  System.out.println("\nPr�fung bestanden");
	}
	else
	{
	  System.out.println("\nPr�fung nicht bestanden");
	}
  }
}