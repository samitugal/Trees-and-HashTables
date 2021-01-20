
class Node {


    public Duraklar getDurak() {
        return durak;
    }

    public void setDurak(Duraklar durak) {
        this.durak = durak;
    }

    Duraklar durak ;
    Node right ;
    Node left ;


    public Node(Duraklar durak) {
        this.durak = durak;
        right = null;
        left = null;
    }


    public void add( Duraklar drk ){
        if(drk.compareTo(durak) < 0 ){
            if(left == null ){
                left = new Node(drk);
            }
            else{
                left.add(drk);
            }

        }
        else if (drk.compareTo(durak) > 0 ){
            if(right == null ){
                right = new Node(drk);
            }
            else{
                right.add(drk);
            }
        }
    }



    public void preOrderPrint(){
        System.out.println("Durak İsmi : "+durak.getDurakAdi()+
                " Boş Park Yeri : "+durak.getBosPark() +
                " Tandem Bisiklet Adet : "+durak.getTandemBisiklet()+
                " Normal Bisiklet Adet : "  + durak.getNormalBisiklet()+" Duraktan Bisiklet Kiralayan Müşteri Sayısı :  "+ durak.getMusteriList().size()+"\n"+"Musteri Bilgileri : "
        );
        for(int i = 0 ; i < durak.getMusteriList().size(); i++){
            System.out.println(durak.getMusteriList().get(i));
        }

        System.out.println("-----------------------------------------------------------");



        if(left != null){
            left.preOrderPrint();
        }
        if(right != null){
            right.preOrderPrint();
        }

    }

    public void searchTree(Node root , int data){
        if(root != null){
            searchTree(root.left,data);
            for(int i =0; i< root.durak.getMusteriList().size();i++){
                if( data == root.durak.getMusteriList().get(i).getMusteriID()){
                    System.out.println(data + " ID'li müşteri " + root.durak.getDurakAdi() + " durağından saat " + root.durak.getMusteriList().get(i).getKiralamaSaati() + "'ta/te bisiklet kiralamıştır.");
                }

            }
            searchTree(root.right,data);

}
}
    public void insertMusteri(Node root , Musteri musteri,String location){
        if(root != null){
            insertMusteri(root.left,musteri,location);

            if(location.equals(root.getDurak().getDurakAdi())){
                root.getDurak().getMusteriList().add(musteri);
                int bisikletSayısı = root.getDurak().getNormalBisiklet()-1;
                root.getDurak().setNormalBisiklet(bisikletSayısı);
                int parkSayısı = root.getDurak().getBosPark()+1;
                root.getDurak().setBosPark(parkSayısı);
            }
            insertMusteri(root.right,musteri,location);
}
    }

}

public class TreeStructure{

    Node root = null;


    public void insert(Duraklar durak){
        if(root == null){
            root = new Node(durak);
        }
        else{
            root.add(durak);
        }

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public TreeStructure() {
    }

    public void preOrderPrint(){
        if(root != null){
            root.preOrderPrint();
        }
    }

    public void searchTree(int data){
        if(root != null){
            root.searchTree(root,data);
        }

    }

    public int maxDepth(Node node ){
        if (node == null)
            return 0;
        else
        {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }



    }
    public void insertMusteri(Musteri musteri , String loc){
        if(root != null){
            root.insertMusteri(root,musteri,loc);
        }

    }






    }






