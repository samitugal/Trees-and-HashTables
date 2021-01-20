import java.util.*;

public class main {
    public static void main(String[] args) {


        String[] duraklar = {"İnciraltı","28","2","10", "Sahilevleri", "8", "1", "11","Doğal Yaşam Parkı", "17","1","6","Bostanlı İskele","7","0","5",
        "Bornova","25","3","14","Evka-3","30","5","10","KüçükPark","15","6","18","Ardeşen","40","15","50","Karşıyaka","12","5","30"};

        TreeStructure treeStructure = new TreeStructure();
        Hashtable<String , Duraklar > hashDurak = new Hashtable<String , Duraklar>();
        ArrayList<String> durakAdları = new ArrayList<String>();

        Duraklar drk = new Duraklar();
        for(int i = 0 ; i <duraklar.length ; i+=4 ){
            Duraklar duraklarObj = new Duraklar(duraklar[i],Integer.valueOf(duraklar[i+1]),Integer.valueOf(duraklar[i+2]),Integer.valueOf(duraklar[i+3]));
            treeStructure.insert(duraklarObj);
            hashDurak.put(duraklar[i],duraklarObj);
            durakAdları.add(duraklar[i]);
        }
        System.out.println("--------------------------------------------------------");
        treeStructure.preOrderPrint();
        System.out.println("Tree Yapısının Max Derinliği : "+ treeStructure.maxDepth(treeStructure.root));
        System.out.println("--------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("ID ile aramak istediğiniz kullancıyı giriniz : ");
        int data = scanner.nextInt();
        treeStructure.searchTree(data);
        System.out.println("--------------------------------------------------------");
        /*
        System.out.print("Bisiklet Kiralamak İstediğiniz Müşteri İD'sini Giriniz : ");
        int data1 =scanner.nextInt();
        System.out.print("Bisikletinizi Kiralamak İstediğiiniz Şubeyi Giriniz : ");
        String data2 = scanner.next();
        System.out.print("Saat Kaçta Kiralamak İstersiniz : ");
        String data3 = scanner.next();
        Musteri musteri2 = new Musteri(data1,data3);
        treeStructure.insertMusteri(musteri2,data2);*/

        Musteri musteri3 = new Musteri(5,"16:00");
        treeStructure.insertMusteri(musteri3,"Ardeşen");
        System.out.println("--------------------------------------------------------");
        treeStructure.preOrderPrint();
        System.out.println("--------------------------------------------------------");
        Collection c = hashDurak.values();
        Iterator iterator = c.iterator();
        Enumeration em = hashDurak.keys();
        System.out.println("Hashtable'in öğeleri :");
        Iterator itr = c.iterator();
        Iterator itr1 = c.iterator();
        System.out.println("HASHTABLE İLK HALİ");
        while (itr.hasNext()){
            System.out.println(itr.next());}

        System.out.println("--------------------------------------------------------");

        for(int i = 0 ; i < durakAdları.size(); i++){
            if(hashDurak.get(durakAdları.get(i)).getBosPark()>5){
                hashDurak.replace(durakAdları.get(i),new Duraklar(hashDurak.get(durakAdları.get(i)).getDurakAdi(),(hashDurak.get(durakAdları.get(i)).getBosPark()-5),hashDurak.get(durakAdları.get(i)).getTandemBisiklet(),hashDurak.get(durakAdları.get(i)).getNormalBisiklet()+5));
            }
        }
        System.out.println("HASHTABLE GÜNCELLENMİŞ HALİ");

        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

}
}
