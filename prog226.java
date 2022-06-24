import java.util.Scanner;
import java.util.Arrays;

/*generic sorted program*/


abstract class Arrayx<T>
{
    public Object Arr[];

    public Arrayx(int size)
    {
       Arr = new Object [size];
    }

    public void Accept()
    {
       Scanner sobj = new Scanner(System.in);
       for(int i=0;i<Arr.length;i++)
       {
         Arr[i] = sobj.next();
       } 
    }

    public void Display()
    {
      for(int i=0;i<Arr.length;i++)
      {
        System.out.println(Arr[i]);
      } 

    }
    public abstract void BubbleSort();
}

class Comparing<T extends Comparable<T>>
{
   public boolean compareTwo(T value1,T value2)
   {
      return (value1.compareTo(value2) > 0);
   }
}

class Sorting<T extends  Comparable<? super T>> extends Arrayx<T>
{
     public Sorting(int size)
     {
       super(size);
     }

         
     public void BubbleSort()
     Object temp;
     {
        for(int i=0;i<Arr.length;i++)
        {
          for(int j=0;(j < ((Arr.length)-i)-1);j++)
          {
              if(Arr[j].compareTo(Arr[j+1])>0)
              {
                  temp = Arr[j];
                  Arr[j] = Arr[j+1];
                  Arr[j+1] = temp;
              }

          }
        }
     }
}


class prog226
{
   public static void main(String arg[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of array");
      int isize = sc.nextInt();

      Sorting <Integer> obj2 = new Sorting <Integer> (isize);
      obj2.Accept();
      System.out.println("Elements are");
      obj2.Display();
      obj2.BubbleSort();
      System.out.println("After the sorting");
      obj2.Display();
      
      Sorting <Character> obj = new Sorting<Character>(isize);
      obj.Accept();
      System.out.println("Elements are");
      obj.Display();
      System.out.println("After the sorting");
      obj.BubbleSort();
      obj.Display();

      Sorting <Boolean> obj1 = new Sorting<Boolean>(isize);
      obj1.Accept();
      System.out.println("Elements are");
      obj1.Display();
      obj1.BubbleSort();
      System.out.println("After the sorting");
      obj1.Display();
   }
}