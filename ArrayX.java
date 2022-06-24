//javac ArrayX.java -d .


package PackageX.CreateArray;
import java.util.Scanner;

public class ArrayX
{
    public int Arr[];

   public  ArrayX(int size)
    {
        Arr=new int[size];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elemets are");
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}
