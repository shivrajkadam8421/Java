import java.util.Scanner;

class Marvellous
{
   public void CharFrequency(String s)
   {
       String s1 = s.replaceAll(" ","");

       char Arr[] = s1.toCharArray();

       System.out.println("Array is :");
       for(char ch : Arr)
       {
           System.out.print(ch);
       }
   } 
}

class prog252
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string");
       String s= sobj.nextLine();
       
       Marvellous moobj = new Marvellous();
        moobj.CharFrequency(s);
     
    }
}