import Tastatur.Eingabe;
public class Blechdose
{
  public static void main(String[] args)
  {
    final double PI = 3.141592654;
    double umfang = Eingabe.readDouble("Geben Sie den Dose Umfang ein: ");
	double doseH�he = Eingabe.readDouble("Geben Sie den Dose Hoch ein: ");
    double durchmessenBoden = umfang / PI;
	double fl�cheBoden = PI * (durchmessenBoden / 2) * (durchmessenBoden / 2);
	double mantelFl�che = umfang * doseH�he;
	double gesamtFl�che =  2 * fl�cheBoden * doseH�he;
	double volumenDose = fl�cheBoden * doseH�he;
	
	System.out.println
	(
	"\n ***************************Blechdose***********************  \n\n" +
	"\nUmfang           : " + umfang + " cm�\n" +
	"\nDose H�he        : " + umfang + " cm�\n" +
	"\nDurchmessen Boden: " + durchmessenBoden + " cm�\n" +
	"\nFl�che Boden     : " + fl�cheBoden + " cm�\n" +
	"\nMantel Fl�che    : " + mantelFl�che + " cm�\n" +
	"\nGesamt Fl�che    : " + gesamtFl�che + " cm�\n" +
	"\nVolumen der Dose: " + volumenDose + " cm�\n"
	);
      
  }
}