import java.util.ArrayList;

public class heapMain {
    public static void main(String[]  args){

            String[] duraklar = {"İnciraltı","28","2","10", "Sahilevleri", "8", "1", "11","Doğal Yaşam Parkı", "17","1","6","Bostanlı İskele","7","0","5",
                    "Bornova","25","3","18","Evka-3","30","5","10","KüçükPark","15","6","18","Ardeşen","40","15","50","Karşıyaka","12","5","30"};

            ArrayList<DuraklarHeap> duraklarList = new ArrayList<DuraklarHeap>();
            DuraklarHeap drk = new DuraklarHeap();
            for(int i = 0 ; i <duraklar.length ; i+=4 ){
                    DuraklarHeap duraklarObj = new DuraklarHeap(duraklar[i],Integer.valueOf(duraklar[i+1]),Integer.valueOf(duraklar[i+2]),Integer.valueOf(duraklar[i+3]));
                    duraklarList.add(duraklarObj);

            }
            Heap heap = new Heap(duraklarList.size());

            for(int j = 0 ; j<duraklarList.size(); j++  ){
                    heap.insert(duraklarList.get(j));
            }

            heap.displayHeap();
            System.out.println("--------------------");
            heap.max3Node();

}
}
