import java.util.Scanner;

class prog114
 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
       int ivalue1=0,ivalue2=0;
         
       System.out.println("enter the first number");
        ivalue1=sobj.nextInt();

        System.out.println("enter the second number");
        ivalue2=sobj.nextInt();
        
        int iAns=(ivalue1+ivalue2);

       System.out.println("Addition is : "+iAns);

    }    
}
