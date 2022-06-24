package JAVAX.CollectionsX;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                            singly linear linkedlist                                                                                                        /////                         ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                            Singly Circular linear linkedlist                                                                                                        /////                         ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


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




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                            Doubly linear linkedlist                                                                                                        /////                         ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                            Doubly Circular linear linkedlist                                                                                                        /////                         ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
