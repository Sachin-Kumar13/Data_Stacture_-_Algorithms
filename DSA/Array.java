package DSA;

public class Array {
    private int []items;
    private int count;
    public Array(int length)
    {
        items=new int[length];
    }
    public void insert(int item)
    {
        //if the array is full,resize it
        if(items.length==count)
        {
            //Create a new array (twice the size)
            int []newItems=new int [count*2];
            //Copy all the existing items
            for(int i=0;i<count;i++)
            {
                newItems[i]=items[i];
            }
            //Set "items" to this new array
            items=newItems;

        }
        //Add the new item at the end
        items[count++]=item;

    }
    public void removeAt(int index)
    {
        //Validate the index
        if(index<0||index>=count)
            throw new IllegalArgumentException();
        //Shift the items to the left to fill the hole
        //[10,20,30,40] ,remove index  1 element
        //1<-2
        //2<-3
        for (int i =index;i<count;i++)
            items[i]=items[i+1];
        count--;
    }
    public int indexOf(int item)
    {
        //if we find it ,return index
        //otherwise ,return -1;
        for(int i=0;i<count;i++)
        {
            if(items[i]==item)
                return i;
        }
        return -1;
    }
    public void print()
    {
        for(int i=0;i<count;i++)
            System.out.println(items[i]);
    }
}
