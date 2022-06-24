import java.util.Scanner;

class prog116 
{
  public static void main(String arg[])
  {
    Scanner sobj=new Scanner(System.in);
    Addition aobj=new Addition();
    
    System.out.println("enter the first number");
    int ivalue1=sobj.nextInt();

    System.out.println("enter the second number");
    int ivalue2=sobj.nextInt();

    int iAns=aobj.add(ivalue1,ivalue2);
    System.out.println("Addition is: "+iAns);


  }
}

class Addition
{
    public int add(int iNo1,int iNo2)
    {
        return (iNo1+iNo2);
    }
}
