package PackageX.LogicString;
import PackageX.CreateStringX.CreateStringX;

public class CntVowels extends CreateStringX
{

    public int CountVowels()
    {
        char Arr[]=str.toCharArray();
        int i=0,iCnt=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]=='a' || Arr[i]=='e' || Arr[i]=='i' || Arr[i]=='o' || Arr[i]=='u' || Arr[i]=='A' || Arr[i]=='E' || Arr[i]=='I' || Arr[i]=='O' || Arr[i]=='U'  )
            {
                iCnt++;
            }
        }

        return iCnt;
    }


}