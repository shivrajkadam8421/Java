import java.util.HashMap;
import java.util.Scanner;

class Marvellous
{
   public void WordFrequency(String str)
   {
    String s2 = str.trim().replaceAll("[ ]{2,}"," ");
       
    String Arr[] = s2.split(" ");

    HashMap <String , Integer> hobj = new HashMap<String , Integer>();
    for(String str1 : Arr)
    {
        
         if(hobj.containsKey(str1))
         {
             hobj.put(str1, ((hobj.get(str1))+1));
         } 
         else
         {
             hobj.put(str1, 1);
         }       
    }
    System.out.println("Frequency of word is : "+hobj);
    
   }
}


class prog254
{
    public static void main(String[] args)
    {
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter the string");
       String s= sobj.nextLine();
       
       Marvellous moobj = new Marvellous();
       moobj.WordFrequency(s) ;
      
    }
}