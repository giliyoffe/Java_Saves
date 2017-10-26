import Tastatur.Eingabe;
public class Blechdose
{
  public static void main(String[] args)
  {
    final double PI = 3.141592654;
    double umfang = Eingabe.readDouble("Geben Sie den Dose Umfang ein: ");
	double doseHöhe = Eingabe.readDouble("Geben Sie den Dose Hoch ein: ");
    double durchmessenBoden = umfang / PI;
	double flächeBoden = PI * (durchmessenBoden / 2) * (durchmessenBoden / 2);
	double mantelFläche = umfang * doseHöhe;
	double gesamtFläche =  2 * flächeBoden * doseHöhe;
	double volumenDose = flächeBoden * doseHöhe;
	
	System.out.println
	(
	"\n ***************************Blechdose***********************  \n\n" +
	"\nUmfang           : " + umfang + " cm²\n" +
	"\nDose Höhe        : " + umfang + " cm²\n" +
	"\nDurchmessen Boden: " + durchmessenBoden + " cm²\n" +
	"\nFläche Boden     : " + flächeBoden + " cm²\n" +
	"\nMantel Fläche    : " + mantelFläche + " cm²\n" +
	"\nGesamt Fläche    : " + gesamtFläche + " cm²\n" +
	"\nVolumen der Dose: " + volumenDose + " cm²\n"
	);
      
  }
}