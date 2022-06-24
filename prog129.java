import java.util.*;
import PackageX.LogicString.CntVowels;


class prog129
{
    public static void main(String arg[])
    {
        CntVowels obj=new CntVowels();
        obj.Accept();
        obj.Display();

        int iRet=obj.CountVowels();
        System.out.println("Number of vowels : "+iRet);
    }
}