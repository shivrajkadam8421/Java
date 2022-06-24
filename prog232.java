
class Node1<T1>
{
  public T1 data;
  public Node1<T1> next;
}

class singlyLL<T1>
{
   private Node1<T1> First;
   private int size;

   public singlyLL()
   {
      this.First = null;
      this.size = 0;
   }

   public void InsertFirst(T1 No)
   {
      Node1<T1> newn = new Node1<T1>();
      newn.data = No;
      newn.next = null;

      if(First==null)
      {
         First = newn;
      }
      else
      {
           newn.next = First;
           First = newn;
      }
      this.size++;
   }

   public void InsertLast(T1 No)
   {
      Node1<T1>newn = new Node1<T1>();
      newn.data = No;
      newn.next = null;

      if(First==null)
      {
         First = newn;
      }
      else
      {
          Node1<T1> temp = First;
          while(temp.next!=null)
          {
             temp = temp.next;
          }  
          temp.next = newn;
      }
      this.size++;
   }

   public void InsertAtPos(T1 No,int pos)
   {
       if((pos < 0) || (pos > size+1))
       {
           return;
       }
       else if(pos == 1)
       {
          InsertFirst(No);
       }  
       else if(pos == size+1)
       {
          InsertLast(No);
       }
       else
       {
         Node1<T1> newn = new Node1<T1>();
         newn.data = No;
         newn.next = null;
          Node1<T1> temp = First;
          int i=1;
          while(i!=pos-1)
          {
             temp =temp.next;
             i++;
          } 
          
          newn.next = temp.next;
          temp.next =newn;
          this.size++;
           
       }
   }

   public void DeleteFirst()
   {
      if(First!=null)
      {
          if(First.next == null)
          {
             First = null;
          }
          else
          {
             First = First.next;
          }
          this.size--;
      }
      else
      {
         return;
      }
   }

   public void DeleteLast()
   {
      if(First!=null)
      {
          if(First.next == null)
          {
             First = null;
          }
          else
          {
             Node1<T1> temp = First;
             while(temp.next.next!=null)
             {
                 temp = temp.next;
             }
             temp.next = null;
          }
          this.size--;
      }
      else
      {
         return;
      }

   }

   public void DeleteAtPos(int pos)
   {
       if((pos < 0) || (pos > size))
       {
           return;
       }
       else if(pos == 1)
       {
          DeleteFirst();
       }  
       else if(pos == size)
       {
          DeleteLast();
       }
       else
       {
          Node1<T1> temp = First;
          int i=1;
          while(i!=pos-1)
          {
             temp =temp.next;
             i++;
          } 
          temp.next = temp.next.next;
          this.size--;
       }
   }

   public void Display()
   {
      Node1<T1> temp = First;
      while(temp!=null)
      {
         System.out.print("|"+temp.data+"|->");
         temp = temp.next;
      }
      System.out.println("null");
   }

   public int Count()
   {
      return this.size;
   }
}


class prog232
{
    public static void main(String[] args)
    {
         singlyLL <Integer>obj = new singlyLL<Integer>();

         obj.InsertFirst(51);
         obj.InsertFirst(21);
         obj.InsertFirst(11);

         obj.Display();
         obj.InsertLast(71);
         obj.Display();
         obj.InsertAtPos(61, 4);
         obj.Display();
         
         int iRet = obj.Count();
         System.out.println("Number of elemets are : "+iRet);

          obj.DeleteAtPos(4);
          obj.Display();
          obj.DeleteFirst();
          obj.Display();
          obj.DeleteLast();
          obj.Display();
         iRet = obj.Count();
         System.out.println("Number of elemets are : "+iRet);


         singlyLL <Character>obj1 = new singlyLL<Character>();

         obj1.InsertFirst('C');
         obj1.InsertFirst('B');
         obj1.InsertFirst('A');

         obj1.Display();
         obj1.InsertLast('O');
         obj1.Display();
         obj1.InsertAtPos('K', 4);
         obj1.Display();
         
         int iRet1 = obj1.Count();
         System.out.println("Number of elemets are : "+iRet1);

          obj1.DeleteAtPos(4);
          obj1.Display();
          obj1.DeleteFirst();
          obj1.Display();
          obj1.DeleteLast();
          obj1.Display();
         iRet1 = obj1.Count();
         System.out.println("Number of elemets are : "+iRet1);

      
     }
}