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

    void TargetedPlot()
    {
        int i=0,j=0,iMax=0,row=0,column=0,isum=0;
        for(i=1;i<(Arr.length-1);i++)
        {
            for(j=1;j<(Arr[i].length-1);j++)
            {
                isum = Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j-1]+Arr[i][j-1]+Arr[i][j+1]+Arr[i+1][j-1]+Arr[i+1][j]+Arr[i+1][j+1];
                if(isum > iMax)
                {
                    iMax = isum;
                    row = i;
                    column = j;
                }
                isum=0;
            }
            
        }
        System.out.println("You should purchase the plot number with row number : "+row +"\ncolumn Number : "+column);
        System.out.println("Density of trees around our plot : "+iMax);
        System.out.println("Number of trees on our plot"+Arr[row][column]); 
    }
}

class prog241
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
 
         obj.TargetedPlot();
    }
}