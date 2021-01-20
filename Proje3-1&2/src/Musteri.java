public class Musteri {

    private int musteriID;
    private String kiralamaSaati;

    public Musteri(int musteriID, String kiralamaSaati) {
        this.musteriID = musteriID;
        this.kiralamaSaati = kiralamaSaati;
    }

    public int getMusteriID() {
        return musteriID;
    }

    public void setMusteriID(int musteriID) {
        this.musteriID = musteriID;
    }

    @Override
    public String toString() {
        if(musteriID<10){
            return "musteriID= " + musteriID + " , kiralamaSaati= " + kiralamaSaati ;
        }
        else{
            return "musteriID= " + musteriID + ", kiralamaSaati= " + kiralamaSaati ;
        }
    }

    public String getKiralamaSaati() {
        return kiralamaSaati;
    }

    public void setKiralamaSaati(String kiralamaSaati) {
        this.kiralamaSaati = kiralamaSaati;
    }


}
