package PackageX.PatternPrint;

public class Pattern2
{
    public void Print1(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;
        for(iCnt1=1;iCnt1<=iRow;iCnt1++)
        {
            for(iCnt2=1;iCnt2<=iCol;iCnt2++)
            {
                   System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }

    public void Print2(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0,iNo=0;
        
        for(iCnt1=1;iCnt1<=iRow;iCnt1++)
        {
            for (iCnt2 = 1,iNo=1; iCnt2 <= iCol;iCnt2++,iNo++) 
            {
              
                    System.out.print(iNo+"\t");
                
            }
            System.out.println("\n");
        }
    }

    public void Print3(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0,iNo=0;
        char ch='\0';
        for(iCnt1=1,ch='A';iCnt1<=iRow;iCnt1++)
        {
            for (iCnt2 = 1,iNo=iCol ;iCnt2 <= iCol;iCnt2++,iNo--) 
            {
              
                    System.out.print(iNo+"\t");
                
            }
            ch++;
            System.out.println("\n");
        }
    }

    public void Print4(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0;

        for(iCnt1=1;iCnt1<=iRow;iCnt1++)
        {
            for(iCnt2=1;iCnt2<=iCol;iCnt2++)
            {
                if((iCnt2%2)==0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
          
            System.out.println("\n");
        }
    }

    public void Print5(int iRow,int iCol)
    {
        int iCnt1=0,iCnt2=0,iNo=0;

        for(iCnt1=1,iNo=1;iCnt1<=iRow;iCnt1++)
        {
            for(iCnt2=1;iCnt2<=iCol;iCnt2++ )
            {
                System.out.print(iNo+"\t");
              
            }
            iNo++;
          
            System.out.println("\n");
        }
    }
}