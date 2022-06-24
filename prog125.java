import java.util.Scanner;
import PackageX.Arithimatic.ArithimaticX;

class prog125
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

        float fRet=aobj.Average();
        System.out.println("Average is : "+fRet);
    }
}