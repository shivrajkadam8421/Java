package PackageX.Arithimatic;
import PackageX.CreateArray.ArrayX;


public class ArithimaticX extends ArrayX
{
    public ArithimaticX(int isize)
    {
        super(isize);
    }

    public int Add()
    {
        int isum=0;
        for (int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            isum=isum+Arr[iCnt];
        }
        return isum;
    }
    public int Maximum()
    {
        int iMax=0;
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(iMax<Arr[iCnt])
            {
                iMax=Arr[iCnt];
            }
        }
        return iMax;
    }

    public int Minimum()
    {
        int iMin=Arr[0];
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(iMin>Arr[iCnt])
            {
                iMin=Arr[iCnt];
            }
        }
        return iMin;
    }

    public float Average()
    {
        int isum=0;
        float Avg= 0.0F;
        for (int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            isum=isum+Arr[iCnt];
        }
        Avg=(isum/Arr.length);

        return Avg;
    }

}