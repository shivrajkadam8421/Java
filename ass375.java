import PackageX.PatternPrint.Pattern2;
import java.util.Scanner;
class ass375
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("enetr the row");
        int iRow=sobj.nextInt();

        System.out.println("enter the column");
        int icol=sobj.nextInt();

        Pattern2 obj=new Pattern2();
        obj.Print5(iRow, icol);


    }
}