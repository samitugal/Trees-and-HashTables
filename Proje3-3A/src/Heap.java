class Node
{
    private int iData;

    public Node(int key){
        { iData = key; }
    }

    public int getKey(){
        { return iData; }
    }
    public void setKey(int id){
        { iData = id; }

    }
}

class Heap
{
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int mx) // constructor
    {
        maxSize = mx;
        currentSize = 0;
        heapArray = new Node[maxSize]; // create array
    }

    public boolean isEmpty()
    { return currentSize==0; }

    public boolean insert(int key)
    {
        if(currentSize==maxSize)
            return false;
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    public void trickleUp(int index)
    {
        int parent = (index-1) / 2;
        Node bottom = heapArray[index];

        while( index > 0 &&
                heapArray[parent].getKey() < bottom.getKey() )
        {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent-1) / 2;
        }
        heapArray[index] = bottom;
    }

    public Node remove()
    {
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index)
    {
        int largerChild;
        Node top = heapArray[index];
        while(index < currentSize/2)
        { // least one child,
            int leftChild = 2*index+1;
            int rightChild = leftChild+1;

            if(rightChild < currentSize &&
                    heapArray[leftChild].getKey() <
                            heapArray[rightChild].getKey())
                largerChild = rightChild;
            else
                largerChild = leftChild;

            if( top.getKey() >= heapArray[largerChild].getKey() )
                break;

            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        } // end while
        heapArray[index] = top;
    }

    public boolean change(int index, int newValue)
    {
        if(index<0 || index>=currentSize)
            return false;
        int oldValue = heapArray[index].getKey();
        heapArray[index].setKey(newValue);
        if(oldValue < newValue)
            trickleUp(index);
        else
            trickleDown(index);
        return true;
    }

    public void displayHeap()
    {
        System.out.print("heapArray: ");
        for(int m=0; m<currentSize; m++)
            if(heapArray[m] != null)
                System.out.print( heapArray[m].getKey() + " ");
            else
                System.out.print( "--");
        System.out.println();

    }

}
