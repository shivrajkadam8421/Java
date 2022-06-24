import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
             hobj.put(str1, (hobj.get(str1))+1);
         } 
         else
         {
             hobj.put(str1, 1);
         }       
    }
    Set <String> sobj = hobj.keySet();
    int iMax=0;
    String outpu=null;
    System.out.println("repeted word are : ");
    for(String s : sobj)
    {
        if(hobj.get(s)>iMax)
        {
            outpu = s;
            iMax = hobj.get(s);
        }

    }
    System.out.println("'"+outpu+"' word occur maximum times i.e : "+iMax);
   
    
   }
}


class prog259
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