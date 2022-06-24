import java.util.*;

class prog219
{
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("How many numbers");
      int isize= sobj.nextInt();

      Searching obj = new Searching(isize);
      obj.Accept();
      obj.Display();

      System.out.println("enter the number to search");
      int iNo = sobj.nextInt();
      boolean bRet =obj.Search(iNo);
      if(bRet == true)
      {
        System.out.println("Number is present");
      }
      else
      {
        System.out.println("Number is not present");
      }
    }
}

abstract class ArrayX
{
    public int Arr[];

   public ArrayX(int iNo)
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
         System.out.println("elements are :");
         for(int i=0;i<Arr.length;i++)
         {
            System.out.println(Arr[i]);
         }
    }  

    public abstract boolean Search(int no);
}

class Searching extends ArrayX
{
   public Searching(int size)
   {
        super(size);
   }

   public boolean Search(int no)
   {
     int i=0;
      for(i=0;i<Arr.length;i++)
      {
          if(Arr[i] == no)
          {
            break;
          }
      }

      if(i==Arr.length)
      {
        return false;
      }
      else
      {
        return true;
      }
   }
}

