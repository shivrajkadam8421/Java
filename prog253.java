import java.util.HashMap;
import java.util.Scanner;

class Marvellous
{
   public void CharFrequency(String s)
   {
       String s1 = s.replaceAll(" ","");

       char Arr[] = s1.toCharArray();

       HashMap <Character, Integer> hobj = new HashMap<Character,Integer>();
       System.out.println("Array is :");
       int i=0;
       for(char ch : Arr)
       {
           if(hobj.containsKey(ch))
           {
               i=hobj.get(ch);
               hobj.put(ch, i+1);
           }
           else
           {
            hobj.put(ch, 1);
           }
       }
       System.out.println("frtequency of each character is :" +hobj);
   } 
}

class prog253
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