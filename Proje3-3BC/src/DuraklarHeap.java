public class DuraklarHeap{

    private String durakAdi;
    private int bosPark;
    private int tandemBisiklet;
    private int normalBisiklet;


    public DuraklarHeap(String durakAdi, int bosPark, int tandemBisiklet, int normalBisiklet) {
        this.durakAdi = durakAdi;
        this.bosPark = bosPark;
        this.tandemBisiklet = tandemBisiklet;
        this.normalBisiklet = normalBisiklet;


    }

    public String getDurakAdi() {
        return durakAdi;
    }

    public void setDurakAdi(String durakAdi) {
        this.durakAdi = durakAdi;
    }

    public int getBosPark() {
        return bosPark;
    }

    public void setBosPark(int bosPark) {
        this.bosPark = bosPark;
    }

    public int getTandemBisiklet() {
        return tandemBisiklet;
    }

    public void setTandemBisiklet(int tandemBisiklet) {
        this.tandemBisiklet = tandemBisiklet;
    }

    public int getNormalBisiklet() {
        return normalBisiklet;
    }

    public void setNormalBisiklet(int normalBisiklet) {
        this.normalBisiklet = normalBisiklet;
    }

    public DuraklarHeap() {
    }

    public int randomInt1t10(){

        double random = ((Math.random()*9)+1);
        int randomSayı = (int) random;
        return randomSayı;
    }

    public int randomInt1t20(){

        double random = ((Math.random()*19)+1);
        int randomSayı = (int) random;
        return randomSayı;
    }

    public String saatGenerate(){
        double random1 = ((Math.random()*24));
        double random2 = ((Math.random()*60));
        int randomSayı1 = (int) random1;
        int randomSayı2 = (int) random2;

        return String.valueOf(randomSayı1)+":"+String.valueOf(randomSayı2); //Buraya Saat Düzenleme Yapılacak

    }


    @Override
    public String toString() {
        return "Duraklar{" +
                "durakAdi='" + durakAdi + '\'' +
                ", bosPark=" + bosPark +
                ", tandemBisiklet=" + tandemBisiklet +
                ", normalBisiklet=" + normalBisiklet ;

    }
}


