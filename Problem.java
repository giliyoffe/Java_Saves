public class Problem
{
  public static void main(String[] args)
  {
    int x,y;                   //changed int to double - but lets try not to.
	double z1,z2;
	x = 3;
	y = 4;
	//den 3 ist ein Leteral . den  x ist ein Variable
	z1 = 3.0 / y;        //placed (double) before y, or can also 3.0 and it will also work.
	z2 = (double)x / 4;	       //placed (double) before x, or can also 4.0 and it will also work. 
	System.out.println(z1);
	System.out.println(z2);
  }
}