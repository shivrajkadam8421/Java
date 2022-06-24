package PackageX.PatternPrint;

public class Pattern5
{
    public void Print1(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;
        for(iCnt1=iRow;iCnt1>=1;iCnt1--)
        {
            for(iCnt2=1;iCnt2<=iCol;iCnt2++)
            {
                if(iCnt1==iCnt2)
                {
                    System.out.print("#\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println("\n");
        }
    }

    public void Print2(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;
        for(iCnt1=iRow;iCnt1>=1;iCnt1--)
        {
            for (iCnt2 = 1; iCnt2 <= iCol; iCnt2++) {
                if(iCnt1==iCnt2)
                {
                    System.out.print("#\t");
                }
                else if(iCnt1>iCnt2)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println("\n");
        }
    }

  
    public void Print3(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;
        for(iCnt1=iRow;iCnt1>=1;iCnt1--)
        {
            for (iCnt2 = 1; iCnt2 <= iCol; iCnt2++) {
                if(iCnt1==1 || iCnt2==1 || iCnt1==iRow || iCnt2==iCol || (iCnt1==iCnt2))
                {
                   System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }


    public void Print4(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;
        for(iCnt1=iRow;iCnt1>=1;iCnt1--)
        {
            for (iCnt2 = 1; iCnt2 <= iCol; iCnt2++) {
                if(iCnt1==1 || iCnt2==1 || iCnt1==iRow || iCnt2==iCol || (iCnt1==iCnt2))
                {
                    System.out.print("*\t");
                }
                else if(iCnt1>iCnt2)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println("\n");
        }
    }

    public void Print5(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;
        for(iCnt1=1;iCnt1<=iRow;iCnt1++)
        {
            for (iCnt2 = 1; iCnt2 <= iCol; iCnt2++) {
                if(iCnt1==1 || iCnt2==1 || iCnt1==iRow || iCnt2==iCol || (iCnt1==iCnt2))
                {
                    System.out.print(iCnt2+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }
}