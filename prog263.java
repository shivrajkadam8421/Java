//varidic function

class Marvellous
{
   public int Addition(int ... a)
   {
      int isum =0;
      for(int i : a)
      {
         isum = isum+i;
      }
      return isum;
   }
}


class prog263
{
    public static void main(String[] args)
    {
       Marvellous mobj = new Marvellous();
            
       int iRet = mobj.Addition(10, 20, 30, 40, 50);
       System.out.println("Addition is :"+iRet);
    }
}