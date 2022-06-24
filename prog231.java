
import java.util.*;



class prog231
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
     
      obj.InsertionSort(Arr);
      
       System.out.println("After Sorting array is : ");
      for (int i=0 ;i<Arr.length;i++) 
      {
         System.out.println(Arr[i]);  
      }  
      
    } 
}



class Sorting
{ 
   public void InsertionSort(int Brr[])
   {
     int i=0,j=0,key=0;
     int size = Brr.length;
     for(i=1;i< size;i++)
     {
        key = Brr[i];
        for(j=i-1;(j>=0) && (Brr[j] > key);j--)
        { 
           Brr[j+1] = Brr[j];

        }  
        Brr[j+1] =key;
     }
      
   }  
   
}