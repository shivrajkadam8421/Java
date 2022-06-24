
class Node4<T4>
{
   public T4 data;
   public Node4<T4> next;
   public Node4<T4> prev;
}

class Doubly_CircularLL<T4>
{
   private Node4<T4> first;
   private Node4<T4> last;
   private int size;

   public Doubly_CircularLL()
   {
      this.first=null;
      this.last=null;
      this.size=0;
   }

   public void InsertFirst(T4 No)
   {
      Node4<T4> newn = new Node4<T4>();
      newn.data=No;
      newn.next=null;
      newn.prev=null;

      if(first==null)
      {
         first=newn;
         last=first;
         last.next=first;
         first.prev=last;
      }
      else
      {
         newn.next=first;
         first.prev=newn;
         first = newn;
         last.next=first;
         first.prev=last;
      }
      this.size++;
   }

   public void InsertLast(T4 No)
   {
      Node4<T4> newn = new Node4<T4>();
      newn.data=No;
      newn.next=null;
      newn.prev=null;

      if(first==null)
      {
         first=newn;
         last=first;
         last.next=first;
         first.prev=last;
      }
      else
      {
        last.next=newn;
        newn.prev=last;
        last=newn;
        last.next=first;
        first.prev=last;
      }
      this.size++;

   }

   public void InsertAtPos(T4 No , int pos)
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
         Node4<T4> newn = new Node4<T4>();
         newn.data=No;
         newn.next=null;
         newn.prev=null; 
         Node4<T4> temp = first;
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
         last.next=first;
         first.prev=last;  
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
              last.next=first;
              first.prev=last; 
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
             last=null;
          }
          else
          {
            last=last.prev;
            last.next=first;
            first.prev=last;
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
         Node4<T4> temp = first;
         int i=1;
         while(i!=pos)
         {
            temp=temp.next;
            i++;
         }
         temp.prev.next=temp.next;
         temp.next.prev=temp.prev;
         last.next=first;
         first.prev=last;
         this.size--;
      }

   }

   public void Display()
   {
      Node4<T4> temp = first;
     do
      {
         System.out.print("<-|"+temp.data+"|->");
         temp = temp.next;
      } while(temp!=(last.next));
      System.out.println("");
   }

   public int Count()
   {
      return this.size;
   }

}


class prog235
{
    public static void main(String[] args)
    {
      Doubly_CircularLL<Character> obj1 = new Doubly_CircularLL<Character>();

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

      Doubly_CircularLL<Float> obj = new Doubly_CircularLL<Float>();

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