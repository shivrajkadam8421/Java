import java.util.Scanner;

class Matrix
{
    public int Arr[][];

    public Matrix(int rows , int columns)
    {
        Arr = new int[rows][columns];
    }

    public void Accept()
    {
        Scanner sobj =new Scanner(System.in);
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }

    }

    public void Display()
    {
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    void TargetedNum()
    {
        int i=0,j=0;
        for(i=1;i<(Arr.length-1);i++)
        {
            for(j=1;j<(Arr[i].length-1);j++)
            {
                if(Arr[i][j]== Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j-1]+Arr[i][j-1]+Arr[i][j+1]+Arr[i+1][j-1]+Arr[i+1][j]+Arr[i+1][j+1])
                {
                    System.out.println("Desired row number : "+i +"\ncolumn Number : "+j);
                }
            }
            
        }
       
    }
}

class prog242
{
    public static void main(String[] args) 
    {
        Scanner sobj =new Scanner(System.in);
        
        System.out.println("enter the Number of rows");
        int rows = sobj.nextInt();

        System.out.println("enter the Number of column");
        int columns = sobj.nextInt();

        Matrix obj = new Matrix(rows, columns);
        System.out.println("Enetr the elements" );
         obj.Accept();
         System.out.println("Elemets are : ");
         obj.Display();
 
         obj.TargetedNum();
    }
}