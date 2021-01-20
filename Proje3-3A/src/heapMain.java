public class heapMain {
    public static void main(String[]  args){

            int value, value2;
            Heap theHeap = new Heap(31);
            boolean success;
            theHeap.insert(70);
            theHeap.insert(40);
            theHeap.insert(50);
            theHeap.insert(20);
            theHeap.insert(60);
            theHeap.insert(100);
            theHeap.insert(80);
            theHeap.insert(30);
            theHeap.insert(10);
            theHeap.insert(90);

            theHeap.displayHeap();
}
}
