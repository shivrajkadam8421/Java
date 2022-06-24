import java.util.Scanner;

class prog117 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter the number");
        int iValue=sobj.nextInt();

        Prime pobj=new Prime();
        boolean bRet=pobj.CheckPrime(iValue);

        if(bRet==true)
        {
            System.out.println("number is Prime");
        }
        else
        {
            System.out.println("number is not Prime");
        }

    }

    
}

class Prime
{
   public boolean CheckPrime(int iNo)
   {
       if(iNo==1)
       {
           return true;
       }
       int icnt=0;
       for(icnt=2;icnt<=(iNo/2);icnt++)
       {
           if((iNo%icnt)==0)
           {
               break;
           }
       }
      if(icnt>(iNo/2))
      {
          return true;
      }
      else
      {
          return false;
      }
   }
}
