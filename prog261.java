//varidic function

class Marvellous
{
   public int Addition(int a,int b,int c)
   {
      return (a+b+c);
   }
    
   
}


class prog261
{
    public static void main(String[] args)
    {
       Marvellous mobj = new Marvellous();
            
       int iRet = mobj.Addition(10, 20, 30);
       System.out.println("Addition is :"+iRet);
    }
}