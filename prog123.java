import java.util.*;

class ArrayX
{
    public int Arr[];

    ArrayX(int size)
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

class ArithimaticX extends ArrayX
{
    ArithimaticX(int isize)
    {
        super(isize);
    }

    public int Add()
    {
        int isum=0;
        for (int iCnt=0;iCnt<Arr.length;iCnt++)
        {
           isum=isum+Arr[iCnt];
        }
        return isum;
    }
    public int Maximum()
    {
        int iMax=0;
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(iMax<Arr[iCnt])
            {
                iMax=Arr[iCnt];
            }
        }
            return iMax;
    }

    public int Minimum()
    {
        int iMin=0;
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(iMin<Arr[iCnt])
            {
                iMin=Arr[iCnt];
            }
        }
        return iMin;
    }

}

class prog123
{
    public static void main(String arg[])
    {
       Scanner sobj=new Scanner(System.in);

       System.out.println("how many elements");
       int iSize=sobj.nextInt();

       ArithimaticX aobj =new ArithimaticX(iSize);
       aobj.Accept();
       aobj.Display();

       int iRet= aobj.Add();
       System.out.println("Addition is : "+iRet);

       int iMax=aobj.Maximum();
       System.out.println("Maximum is : "+iMax);

       int iMin=aobj.Minimum();
       System.out.println("Minimum is : "+iMin);
    }
}