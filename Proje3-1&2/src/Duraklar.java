import java.util.ArrayList;
import java.util.List;

public class Duraklar implements Comparable<Duraklar> {

    private String durakAdi;
    private int bosPark;
    private int tandemBisiklet;
    private int normalBisiklet;
    private List<Musteri> musteriList = new ArrayList<>();

    public Duraklar (String durakAdi, int bosPark, int tandemBisiklet, int normalBisiklet) {
        this.durakAdi = durakAdi;
        this.bosPark = bosPark;
        this.tandemBisiklet = tandemBisiklet;
        this.normalBisiklet = normalBisiklet;

        for(int i = 0 ; i < randomInt1t10() ; i++){
            Musteri musteri = new Musteri(randomInt1t20(),saatGenerate());
            musteriList.add(musteri);
        }


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

    public List<Musteri> getMusteriList() {
        return musteriList;
    }

    public void setMusteriList(List<Musteri> musteriList) {
        this.musteriList = musteriList;
    }

    public Duraklar() {
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
        if(randomSayı1<10 && randomSayı2<10){
            return "0"+String.valueOf(randomSayı1)+":0"+String.valueOf(randomSayı2);
        }
        else if(randomSayı1<10 && randomSayı2>10){
           return  "0"+String.valueOf(randomSayı1)+":"+String.valueOf(randomSayı2);
        }
        else if(randomSayı1>10 && randomSayı2<10){
            return  String.valueOf(randomSayı1)+":0"+String.valueOf(randomSayı2);
        }
        else{
            return String.valueOf(randomSayı1)+":"+String.valueOf(randomSayı2);
        }
    }

    @Override
    public int compareTo(Duraklar o) {
        if(this.getDurakAdi().compareTo(o.durakAdi)==0){
            return 0;
        }
        else if (this.getDurakAdi().compareTo(o.durakAdi)<0){
            return -1;
        }
        else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "Duraklar{" +
                "durakAdi='" + durakAdi + '\'' +
                ", bosPark=" + bosPark +
                ", tandemBisiklet=" + tandemBisiklet +
                ", normalBisiklet=" + normalBisiklet +
                ", musteriList=" + musteriList +
                '}';
    }
}


