package kartoyunu;

import java.util.ArrayList;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar() {
    }

    public Bilgisayar(String kullanıcıID, String KullanıcıIsim, int skor, ArrayList<Futbolcu> futbolcular, ArrayList<Basketbolcu> basketbolcular) {
        super(kullanıcıID, KullanıcıIsim, 0, futbolcular, basketbolcular);

    }

    public void kartSec( int index) {
        super.kartSec();
        if (getFutbolcular().get(index).kartKullanildiMi() == false) {
            System.out.println(getFutbolcular().get(index).getSporcuIsim() + "Bilgisayar Secti.");

        } else {
            System.out.println("Kartı daha önce kullandın.");
        }
    }

    public void kartSec(int x,int index) {
        super.kartSec();
        if (getBasketbolcular().get(index).kartKullanildiMi() == false) {
            System.out.println(getBasketbolcular().get(index).getSporcuIsim() + "Bilgisayar Secti.");

        } else {
            System.out.println("Kartı daha önce kullandın.");
        }
    }
}
