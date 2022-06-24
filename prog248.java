import java.util.Scanner;

class prog248
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string");
       String s= sobj.nextLine();

       String s2 = s.trim().replaceAll("[ ]{2,}","  ");
       
       String Arr[] = s2.split(" ");

       for(int i=0;i<Arr.length;i++)
       {
           System.err.println(Arr[i]);
       }
    }
}