
import java.util.*;



class prog227
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

      Sorting obj = new  Sorting();
     
      obj.BubbleSort(Arr);
      
       System.out.println("After Sorting array is : ");
      for (int i=0 ;i<Arr.length;i++) 
      {
         System.out.println(Arr[i]);  
      }  
      
    } 
}


class Sorting
{
  
   public void BubbleSort(int Brr[])
   {
     boolean bRet = ChkSorted(Brr);
     if(bRet == true)
     {
       System.out.println("Arraya is already sorted");
       return;
     }
     else
     {
      int pass=0,j=0,temp=0;
     
      for(pass=0; pass<Brr.length ; pass++)
      {
      
        for(j=0 ; (j< ((Brr.length)-pass)-1);j++)
        {
          if(Brr[j] > Brr[j+1])
          {
            
            temp =Brr[j];
            Brr[j]=Brr[j+1];
            Brr[j+1]=temp;
          }
        }
         
         
         System.out.println("Elements After pass are : ");
         for (int i=0 ;i<Brr.length;i++) 
         {
            System.out.println(Brr[i]);  
          }
          System.out.println(" ");  

      }
     }
   }  

    public boolean ChkSorted(int Arr[])
    {
      int size = Arr.length;
      boolean flag=true;
      if(Arr[0] > Arr[size-1])
      {
          int i=0;
          for(i=0;i<(Arr.length-1);i++)
          {
            if(Arr[i] < Arr[i+1])
            {
                flag = false;
            }
          }
          return flag;
      }
      else
      {
        int i=0;
          for(i=0;i<(Arr.length-1);i++)
          {
            if(Arr[i] > Arr[i+1])
            {
                flag = false;
            }
          }
          return flag;

      }
     
    }
   
}