import java.util.*;


class prog121
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iSize=0,iCnt=0;

        System.out.println("how many elements");
        iSize=sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("enter the numbers :");

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]= sobj.nextInt();
        }

        System.out.println("elements are :");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
}