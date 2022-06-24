import java.util.Scanner;

class Marvellous
{
   public String WordRevers(String str)
   {
    String s2 = str.trim().replaceAll("[ ]{2,}"," ");
       
    String Arr[] = s2.split(" ");

    StringBuffer output = new StringBuffer();
    for(String str1 : Arr)
    {
        StringBuffer sobj = new StringBuffer(str1);
        output = output.append(sobj.reverse());
        output = output.append(" ");
    }
    String ret = new String(output);
    return ret.trim();
   }
}


class prog251
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string");
       String s= sobj.nextLine();
       
       Marvellous moobj = new Marvellous();
      String str =  moobj.WordRevers(s) ;
      System.out.println("Reverse String is : "+ str);
    }
}