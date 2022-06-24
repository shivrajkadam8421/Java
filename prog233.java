
class Node2<T2>
{
   public T2 data;
   public Node2<T2> next;
}

class Singly_CircularLL<T2>
{
   private Node2<T2> first;
   private Node2<T2> last;
   private int size;

   public Singly_CircularLL()
   {
      this.first=null;
      this.last=null;
      this.size=0;
   }

   public void InsertFirst(T2 No)
   {
      Node2<T2> newn = new Node2<T2>();
      newn.data=No;
      newn.next=null;

      if(first==null)
      {
          first=newn;
          last=newn;
          last.next=first;
      }
      else
      {
         newn.next=first;
         first = newn;
         last.next=first;
      }
      this.size++;
   }

   public void InsertLast(T2 No)
   {
      Node2<T2> newn = new Node2<T2>();
      newn.data=No;
      newn.next=null;

      if(first==null)
      {
          first=newn;
          last=newn;
          last.next=first;
      }
      else
      {
         last.next=newn;
         last=newn;
         last.next=first;   
      }
      this.size++;

   }

   public void InsertAtPos(T2 No,int pos)
   {
      if((pos < 0) || (pos > size+1))
      {
         return;
      }
      else if(pos ==1)
      {
         InsertFirst(No);
      }
      else if(pos == size+1)
      {
         InsertLast(No);
      }
      else
      {
         Node2<T2> newn = new Node2<T2>();
         newn.data=No;
         newn.next=null;
         Node2<T2> temp = first;
         int i=1;
         while(i!=pos-1)
         {
            temp=temp.next;
            i++;
         }
         newn.next=temp.next;
         temp.next=newn;
         last.next=first;
         this.size++;

      }
   }

   public void DeleteFirst()
   {
      if(first!=null)
      {
           if(first.next==first)
           {
              first=null;
              last=null;
           }
           else
           {
              first=first.next;
              last.next=first;
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
           if(first.next==first)
           {
              first=null;
              last=null;
           }
           else
           {
              Node2<T2> temp = first;
              while(temp.next!=last)
              {
                 temp=temp.next;
              }
              last = temp;
              last.next=first;
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
      else if(pos ==1)
      {
         DeleteFirst();
      }
      else if(pos == size)
      {
         DeleteLast();
      }
      else
      {
         Node2<T2> temp = first;
         int i=1;
         while(i!=pos-1)
         {
            temp=temp.next;
            i++;
         }
         temp.next=temp.next.next;
         last.next=first;
         this.size--;

      }

   }

   public void Display()
   {
      if(size!=0)
      {

      Node2<T2> temp =first;
      do
      {
         System.out.print("|"+temp.data+"|->");
         temp=temp.next;
         
      }while(temp!=(last.next));
      System.out.println();
      }
      else
      {
         return;
      }
   }

   public int Count()
   {
      return this.size;
   }
}


class prog233
{
    public static void main(String[] args)
    {
         Singly_CircularLL<Character> obj1 = new Singly_CircularLL<Character>();

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

         Singly_CircularLL<Float> obj = new Singly_CircularLL<Float>();

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