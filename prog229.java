
import java.util.*;



class prog229
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
      int pass=0,j=0,temp=0;
      boolean flag = false;
      for(pass=0,flag = true; (pass<Brr.length) && (flag ==true) ; pass++)
      {
       
        for(j=0,flag =false ; (j< ((Brr.length)-pass)-1);j++)
        {
          if(Brr[j] > Brr[j+1])
          {
            flag = true;
            temp =Brr[j];
            Brr[j]=Brr[j+1];
            Brr[j+1]=temp;
          }
        }
         if(flag == false)    break;
         
         System.out.println("Elements After pass are : ");
         for (int i=0 ;i<Brr.length;i++) 
         {
            System.out.println(Brr[i]);  
          }
          System.out.println(" ");  
      }
     
   }  
   
}