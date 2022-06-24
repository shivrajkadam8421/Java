
import java.util.*;



class prog230
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
     
      obj.SelectionSort(Arr);
      
       System.out.println("After Sorting array is : ");
      for (int i=0 ;i<Arr.length;i++) 
      {
         System.out.println(Arr[i]);  
      }  
      
    } 
}


class Sorting
{ 
   public void SelectionSort(int Brr[])
   {
      int i = 0, j = 0, miniindex = 0, temp =0;;
      int size = Brr.length;

      for(i=0;i<size;i++)
      {
        miniindex=i;
        for(j=i;j<size;j++)
        {
           if(Brr[miniindex] > Brr[j])
           {
             miniindex = j;
           }
        }
        temp = Brr[i];
        Brr[i] = Brr[miniindex];
        Brr[miniindex] = temp;

      }
   }  
   
}