import java.util.*;

class Marvellous
{
    public int Add(int brr[])
    {
        int isum=0,iCnt=0;
        for(iCnt=0;iCnt< brr.length;iCnt++)
        {
            isum=isum+brr[iCnt];
        }
        return isum;
    }

  }

class prog122
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iSize=0,iCnt=0,iRet=0;

        System.out.println("how many elements");
        iSize=sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("enter the numbers :");

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]= sobj.nextInt();
        }

        Marvellous mobj=new Marvellous();
        iRet=mobj.Add(Arr);
        System.out.println("Addition is :"+iRet);

    }
}

