import java.util.*;

class prog223
{
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("How many numbers");
      int isize= sobj.nextInt();

      int Arr[] = new int[isize];

      System.out.println("Eneter the lements are : ");
      for(int i = 0 ;i< Arr.length ; i++)
      {
        Arr[i]=sobj.nextInt();
      }
  
      System.out.println("Elements are : ");
      for (int i=0 ;i<Arr.length;i++) 
      {
         System.out.println(Arr[i]);  
      }  

      Searching obj = new  Searching();
       obj.Change(Arr);

       System.out.println("After change the array : ");
      for (int i=0 ;i<Arr.length;i++) 
      {
         System.out.println(Arr[i]);  
      }  
  
    }
}


class Searching
{
   public void Change(int Brr[])
   {
     for(int i=0;i< Brr.length;i++)
     {
       Brr[i]++;
     }

   }
}