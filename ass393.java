
import PackageX.PatternPrint.Pattern4;
import java.util.Scanner;
class ass393
{
    public static void main(String[] args)
    {
          Scanner sobj=new Scanner(System.in);
          System.out.println("Enter the String");
          String str=sobj.nextLine();

          Pattern4 obj=new Pattern4(str);
          obj.Print3();

    }
     
}