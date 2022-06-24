//varidic function

class Marvellous
{
   public void display(int ... a)
   {
      System.out.println("Number of arguments are :"+a.length);
   }
    
   
}


class prog262
{
    public static void main(String[] args)
    {
       Marvellous mobj = new Marvellous();
       mobj.display(11,21,51,101);            
  
    }
}