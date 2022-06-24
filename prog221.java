import java.util.*;

class prog221
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
      boolean bRet = obj.BinarySerch(Arr, iNo);
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
   public boolean BinarySerch(int Brr[],int iNo)
   {
      int start,end,mid;

      start = 0;
      end= Brr.length-1;
      mid= (start + end)/2;

      while(start <= end )
      {
        if(Brr[mid]==iNo)
        {
          break;
        }
        else if(iNo > Brr[mid])
        {
            start = mid + 1;
        }
        else if(iNo < Brr[mid])
        {
            end = mid - 1;
        }
        mid = (start + end ) / 2;
      }
      if(Brr[mid] == iNo)
      {
         return true;
      }
      else
      {
        return false;
      }

   }
}