import java.util.Scanner;

class Marvellous
{
    public void Display(String Data)
    {
        System.out.println("Welcome :"+Data);
    }
}

class prog127
{
    public static void main(String[] arg)
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter your name:");
        String str=sobj.nextLine();

        Marvellous mobj=new Marvellous();
        mobj.Display(str);
    }
}