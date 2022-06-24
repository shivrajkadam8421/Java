
import PackageX.PatternPrint.Pattern3;
import java.util.Scanner;
class ass385
{
    public static void main(String[] args)
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the String");
          String str=sobj.nextLine();

          Pattern3 obj=new Pattern3(str);
          obj.Print5();

    }
     
}