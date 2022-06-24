import PackageX.LogicString.CntVowelsUsingWhile;


class prog130
{
    public static void main(String arg[])
    {
        CntVowelsUsingWhile obj=new CntVowelsUsingWhile();
        obj.Accept();
        obj.Display();

        int iRet=obj.CountVowels();
        System.out.println("Number of vowels : "+iRet);
    }
}