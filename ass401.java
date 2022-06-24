import PackageX.PatternPrint.Pattern5;
import java.util.Scanner;
class ass401
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enetr the row");
        int iRow=sobj.nextInt();

        System.out.println("enter the column");
        int icol=sobj.nextInt();

        Pattern5 obj=new Pattern5();
        obj.Print1(iRow, icol);


    }
}