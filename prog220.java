import java.util.*;

class prog220
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

      System.out.println("Elements are to search : ");
      int iNo =sobj.nextInt();

      Searching obj = new  Searching();
      boolean bRet = obj.LinearSerch(Arr, iNo);
      if(bRet==true)
      {
        System.out.println("Number is present");
      }
      else
      {
        System.out.println("Number is not present");
      }

    }
}


class Searching
{
   public boolean LinearSerch(int Brr[],int iNo)
   {
     int i=0;
      for (i=0;i<Brr.length;i++ )
      {
          if(Brr[i] == iNo)
          {
            break;
          }
      }

      if(i==Brr.length)
      {
        return false;
      }
      else
      {
        return true;
      }
   }
}