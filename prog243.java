import java.util.Scanner;

class prog243
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string");
       String s= sobj.nextLine();

       System.out.println("String is : "+s);
       System.out.println("string length is : "+s.length());
    }
}