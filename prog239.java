import java.util.Scanner;


class prog239
{
    public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);
        
        System.out.println("enter the Number of rows");
        int rows = sobj.nextInt();

        System.out.println("enter the Number of column");
        int columns = sobj.nextInt();

        int Arr[][] = new int[rows][columns];

        System.out.println("Enetr the elements" );

        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }

        System.out.println("Elemets are : ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}