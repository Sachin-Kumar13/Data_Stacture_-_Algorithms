package DSA;

import javax.swing.*;
import java.util.NoSuchElementException;

public class LinkedList
{
    private Node first;
    private Node last;
    //addFirst
    public void addLast(int item)
    {
        Node node =new Node(item);
       // node.value=item;

        if(first==null)
        {
            first=last=node;
        }
    else
        {
          last.next=node;
          last=node;
        }
    }
    //addLast
    public void addFirst(int item)
    {
        var node =new Node(item);
        if(isEmpty())
        {
            first=last=node;
        }
        else{
            node.next=first;
            first=node;
        }
    }
    //deleteFirst
    public void removeFirst()
    {
        if(isEmpty())
        throw new NoSuchElementException();
        if(first==last)
        {
            first=last=null;
        }
        var second =first.next;
        first.next=null;
        first=second;
    }
    //deleteLast
    public void removeLast()
    {

        if(isEmpty())
            throw new NoSuchElementException();
        if (first==last)
        {
            first=last=null;
            return;
        }
       var previous= getPrevious(last);
       last =previous;
       last.next=null;

    }

    //contains
    public boolean contains(int item)
    {
        return indexOf(item)!=-1;

    }
    //indexOf
    public int indexOf(int item)
    {
        int index=0;
        var current=first;
        while(current!=null)
        {
            if(current.value==item) return index;
            current=current.next;
            index++;
        }
        return -1;
    }
private boolean isEmpty()
{
    return first==null;
}
private Node getPrevious(Node node)
{
   var current =first;
   while(current!=null)
   {
       if(current.next==node) return current;
       current=current.next;
   }
   return null;
}
public void print()
{
    var current=first;
    while(current!=null)
    {
        System.out.print(current.value);
        current=current.next;
        System.out.println();
    }
}
}
