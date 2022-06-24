import java.util.Scanner;


class prog119 
{
   public static void main(String arg[])
   {
       Scanner sobj=new Scanner(System.in);
       
       System.out.println("enter the number");
       int iValue=sobj.nextInt();

       Amstrong aobj=new Amstrong();
        boolean bRet=aobj.ChkAmstrong(iValue);

        if(bRet==true)
        {
            System.out.println("number is amstrong");
        }
        else{
            System.out.println("number is not amstrong");
        }
       
   }  
}

class Amstrong
{
    public boolean ChkAmstrong(int iNo)
    {
        int idigit=0,idigitCnt=0,ipow=1,isum=0,itemp=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }
        itemp=iNo;

        while(itemp!=0)
        {
           idigitCnt++;
           itemp=itemp/10;
        }
        itemp=iNo;

        while(itemp!=0)
        {
            idigit=itemp%10;
            for(int icnt=1;icnt<=idigitCnt;icnt++)
            {
                ipow=ipow*idigit;
            }
            isum=isum+ipow;
            ipow=1;
            itemp=itemp/10;
        }
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

