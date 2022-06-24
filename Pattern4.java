package PackageX.PatternPrint;

public class Pattern4
{
    
    public String str;

   public Pattern4(String Str2)
    {
       str=Str2;
    }

    public void Print1()
    {
        int iRow=str.length(),iCnt1=0;
        int iCol=str.length(),iCnt2=0;

        for(iCnt1=0;iCnt1<iRow;iCnt1++)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
              
            }
          
            System.out.println("\n");
        }
    }

    public void Print2()
    {
        int iRow=str.length(),iCnt1=0;
        int iCol=str.length(),iCnt2=0;

        for(iCnt1=(iRow-1);iCnt1>=0;iCnt1--)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
              
            }
          
            System.out.println("\n");
        }
    }

    public void Print3()
    {
        int iRow=str.length(),iCnt1=0;
        int iCol=str.length(),iCnt2=0;

        for(iCnt1=0;iCnt1<iRow;iCnt1++)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("#\t");
                }
              
            }
          
            System.out.println("\n");
        }
    }

    public void Print4()
    {
        int iRow=str.length(),iCnt1=0;
        int iCol=str.length(),iCnt2=0;


        for(iCnt1=(iRow-1);iCnt1>=0;iCnt1--)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
              
            }
          
            System.out.println("\n");
        }

        iCnt1=0;iCnt2=0;

        for(iCnt1=1;iCnt1<iRow;iCnt1++)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
              
            }
          
            System.out.println("\n");
        }
    }

    
    public void Print5()
    {
        int iRow=str.length(),iCnt1=0;
        int iCol=str.length(),iCnt2=0;

        for(iCnt1=0;iCnt1<(iRow-1);iCnt1++)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("#\t");
                }
              
            }
          
            System.out.println("\n");
        }
        iCnt1=0;iCnt2=0;
        for(iCnt1=(iRow-1);iCnt1>=0;iCnt1--)
        {
            for(iCnt2=0;iCnt2<iCol;iCnt2++ )
            {
                if(iCnt1>=iCnt2)
                {
                    System.out.print(str.charAt(iCnt2)+"\t");
                }
                else
                {
                    System.out.print("#\t");
                }
              
            }
          
            System.out.println("\n");
        }
    }



}
