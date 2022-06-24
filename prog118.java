import java.util.Scanner;


class prog118
 {
        public static void main(String arg[])
        {
            Scanner sobj=new Scanner(System.in);

            System.out.println("enter the number");
            int iValue=sobj.nextInt();
    
            Primeflag pobj=new Primeflag();
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
class Primeflag
{
   public boolean CheckPrime(int iNo)
   {
       if(iNo==1)
       {
           return true;
       }
       boolean bflag=true;
       for(int icnt=2;icnt<=(iNo/2);icnt++)
       {
           if((iNo%icnt)==0)
           {
               bflag=false;
           }
       }
        return bflag;
   }
}