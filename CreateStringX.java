package PackageX.CreateStringX;

import java.util.Scanner;

public class CreateStringX
{
    public String str;

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        str=sobj.nextLine();
    }

    public void Display()
    {

        System.out.println("String is :  "+str);
    }
}