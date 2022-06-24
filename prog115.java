import java.util.Scanner;

public class prog115
 {
    public static void main(String arg[])
     {
        Scanner sobj=new Scanner(System.in);
        int ivalue1=0;
        int ivalue2=0;
        
        System.out.println("enter the first number");
        ivalue1=sobj.nextInt();

        System.out.println("enter the second number");
        ivalue2=sobj.nextInt();

        int iAns=Addition(ivalue1,ivalue2);
         System.out.println("Addition is : "+iAns);
    }

    static int Addition(int iNo1,int iNo2 )
    {
        return (iNo1+iNo2);
    }
}
