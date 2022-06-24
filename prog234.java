
class Node3<T3>
{
   public T3 data;
   public Node3<T3> next;
   public Node3<T3> prev;
}

class DoublyLL<T3>
{
   private Node3<T3> first;
   private int size;

   public DoublyLL()
   {
      this.first=null;
      this.size=0;
   }

   public void InsertFirst(T3 No)
   {
      Node3<T3> newn = new Node3<T3>();
      newn.data=No;
      newn.next=null;
      newn.prev=null;

      if(first==null)
      {
         first=newn;
      }
      else
      {
         newn.next=first;
         first.prev=newn;
         first = newn;
      }
      this.size++;
   }

   public void InsertLast(T3 No)
   {
      Node3<T3> newn = new Node3<T3>();
      newn.data=No;
      newn.next=null;
      newn.prev=null;

      if(first==null)
      {
         first=newn;
      }
      else
      {
         Node3<T3> temp = first;
         while(temp.next!=null)
         {
            temp=temp.next;
         }
         temp.next=newn;
         newn.prev=temp;
         newn.next=null;
      }
      this.size++;

   }

   public void InsertAtPos(T3 No , int pos)
   {
      if((pos < 0) || (pos > size+1))
      {
         return;
      }
      else if(pos==1)
      {
         InsertFirst(No);
      }
      else if(pos == size+1)
      {
         InsertLast(No);
      }
      else
      {
         Node3<T3> newn = new Node3<T3>();
         newn.data=No;
         newn.next=null;
         newn.prev=null; 
         Node3<T3> temp = first;
         int i=1;
         while(i!=pos-1)
         {
            temp=temp.next;
            i++;
         }
         newn.next=temp.next;
         temp.next.prev=newn;
         temp.next=newn;
         newn.prev=temp;  
         this.size++;

      }
   }

   public void DeleteFirst()
   {
      if(first!=null)
      {
          if(first.next==null)
          {
             first=null;
          }
          else
          {
              first=first.next;
              first.prev=null;
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
      if(first!=null)
      {
          if(first.next==null)
          {
             first=null;
          }
          else
          {
             Node3<T3> temp = first;
             while(temp.next.next!=null)
             {
                temp=temp.next;
             }
             temp.next=null;
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
      else if(pos==1)
      {
         DeleteFirst();
      }
      else if(pos == size)
      {
         DeleteLast();
      }
      else
      {
         Node3<T3> temp = first;
         int i=1;
         while(i!=pos-1)
         {
            temp=temp.next;
            i++;
         }
         temp.next=temp.next.next;
         temp.next.prev=temp;
         this.size--;
      }

   }

   public void Display()
   {
      Node3<T3> temp = first;
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


class prog234
{
    public static void main(String[] args)
    {
      DoublyLL<Character> obj1 = new DoublyLL<Character>();

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

      DoublyLL<Float> obj = new DoublyLL<Float>();

      obj.InsertFirst(51.2f);
      obj.InsertFirst(21.30f);
      obj.InsertFirst(11.54f);

      obj.Display();
     obj.InsertLast(71.21f);
      obj.Display();
      obj.InsertAtPos(61.64f, 4);
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
      
     }
}