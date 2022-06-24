package PackageX.LogicString;
import PackageX.LogicString.StringReverseX;

public class StrPallindrome extends StringReverseX
{
    public boolean ChkPallindrome()
    {
        boolean bRet=false;
        String newstr=ReverseX();

        bRet=newstr.equals(str);
        return bRet;

    }

}