
import PackageX.LogicString.StrPallindrome;

class prog132
{
    public static void main(String arg[])
    {
        boolean bRet=false;
       StrPallindrome obj=new StrPallindrome();
        obj.Accept();
        obj.Display();

        bRet = obj.ChkPallindrome();
        if(bRet==true)
        {
            System.out.println("String is pallindrome");
        }
        else
        {
            System.out.println("String is not pallindrome");
        }
    }
}