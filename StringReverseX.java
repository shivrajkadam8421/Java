package PackageX.LogicString;
import java.lang.*;

import PackageX.CreateStringX.CreateStringX;

public class StringReverseX extends CreateStringX
{
    public String ReverseX()
    {
        char Arr[]=str.toCharArray();
        int iStart=0;int iEnd=Arr.length-1;
        char temp;
        int i=0;
        while (iStart<iEnd)
        {
            temp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=temp;
            iStart++;
            iEnd--;
        }

        String string=new String(Arr);
        return string;
    }
}