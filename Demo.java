public class Demo 
{
    public static void main(String[] args)
    {
        int zahl = 3;
        zahl++;
        System.out.println(zahl);  //4  
        ++zahl;                     
        System.out.println(zahl);    //5
        System.out.println(++zahl);  //6
        System.out.println(zahl++);  //6
        System.out.println(zahl);    //7
    }
}