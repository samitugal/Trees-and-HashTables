class Node {
    private DuraklarHeap iData;

    public Node(DuraklarHeap iData) {
        this.iData = iData;
    }

    public DuraklarHeap getKey() {
        return iData;
    }

    public void setKey(DuraklarHeap iData) {
        this.iData = iData;
    }


}

class Heap
{
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int mx)
    {
        maxSize = mx;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public boolean isEmpty()
    { return currentSize==0; }

    public boolean insert(DuraklarHeap key)
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
                heapArray[parent].getKey().getNormalBisiklet() < bottom.getKey().getNormalBisiklet() )
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
                    heapArray[leftChild].getKey().getNormalBisiklet() <
                            heapArray[rightChild].getKey().getNormalBisiklet())
                largerChild = rightChild;
            else
                largerChild = leftChild;

            if( top.getKey().getNormalBisiklet() >= heapArray[largerChild].getKey().getNormalBisiklet() )
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
        int oldValue = heapArray[index].getKey().getNormalBisiklet();
        heapArray[index].getKey().setNormalBisiklet(newValue);
        if(oldValue < newValue)
            trickleUp(index);
        else
            trickleDown(index);
        return true;
    }

    public void displayHeap()
    {
        System.out.println("heapArray: ");
        for(int m=0; m<currentSize; m++)
            if(heapArray[m] != null)
                System.out.println( heapArray[m].getKey() + " ");
            else
                System.out.print( "--");
        System.out.println();

    }

    public void max3Node(){
        System.out.println("Maximum Bisiklete Sahip 3 Durak : ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println(heapArray[i].getKey());
        }

    }

}

