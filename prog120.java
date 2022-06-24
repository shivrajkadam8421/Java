import java.util.Scanner;


class Amstrongfun
{
    public boolean ChkAmstrong(int iNo)
    {
        int idigit=0,idigitCnt=0,isum=0,itemp=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }
        itemp=iNo;

       CountDigit cobj=new CountDigit();
        idigitCnt=cobj.CntDigit(itemp);

        Power pobj=new Power();
        isum=pobj.power(itemp, idigitCnt);
        
        if(isum==iNo)
        {
            return true;
        }
        else
         {
             return false;
         }        
    }
}

class CountDigit
{
    public int CntDigit(int iNo)
    {
        int iCnt=0;
        while(iNo!=0)
        {
           iCnt++;
           iNo=iNo/10;
        }
        return iCnt;
    }
}

class Power
{
    public int power(int iNo,int DigitCnt)
    {
        int idigit=0,icnt=0,ipower=1,isum=0;
        while(iNo!=0)
        { 
            idigit=iNo%10;
            for(icnt=1;icnt<=DigitCnt;icnt++)
            {
                ipower=ipower*idigit;
            }
            isum=isum+ipower;
            ipower=1;
            iNo=iNo/10;
        }
        return isum;
    }
}
