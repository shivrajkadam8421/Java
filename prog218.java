import java.util.*;

class prog218
{
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("How many numbers");
      int isize= sobj.nextInt();
    }
}

abstract class Searching
{
    public int Arr[];

   public Searching(int iNo)
    {
      Arr = new int[iNo];
    }

  public void Accept()
    {
         Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the elements");
         for(int i=0;i<Arr.length;i++)
         {
            Arr[i]= sobj.nextInt();
         }
    }

  public void Display()
    {
         Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the elements");
         for(int i=0;i<Arr.length;i++)
         {
            System.out.println(Arr[i]);
         }
    }  
}