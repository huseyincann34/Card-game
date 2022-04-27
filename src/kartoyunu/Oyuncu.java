package kartoyunu;

import java.util.ArrayList;

public class Oyuncu {

    private String oyuncuID;
    private String oyuncuIsim;
    private int skor;
    private ArrayList<Futbolcu> futbolcular = new ArrayList<Futbolcu>();
    private ArrayList<Basketbolcu> basketbolcular = new ArrayList<Basketbolcu>();

    public Oyuncu() {

    }

    public Oyuncu(String oyuncuID, String oyuncuIsim, int skor, ArrayList<Futbolcu> futbolcular, ArrayList<Basketbolcu> basketbolcular) {
        this.oyuncuID = oyuncuID;
        this.oyuncuIsim = oyuncuIsim;
        this.skor = skor;
        this.basketbolcular = basketbolcular;
        this.futbolcular = futbolcular;
    }

    
    public int skorGoster() {
    return  skor+=10;
    }

     public void kartSec() {
        
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuIsim() {
        return oyuncuIsim;
    }

    public void setOyuncuIsim(String oyuncuIsim) {
        this.oyuncuIsim = oyuncuIsim;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public ArrayList<Futbolcu> getFutbolcular() {
        return futbolcular;
    }

    public void setFutbolcular(ArrayList<Futbolcu> futbolcular) {
        this.futbolcular = futbolcular;
    }

    public ArrayList<Basketbolcu> getBasketbolcular() {
        return basketbolcular;
    }

    public void setBasketbolcular(ArrayList<Basketbolcu> basketbolcular) {
        this.basketbolcular = basketbolcular;
    }

}
