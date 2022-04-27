package kartoyunu;

public class Basketbolcu extends Sporcu {
private String basketbolcuAdi;
private String basketbolcuTakim;
private    int ikilik;
 private   int ucluk;
private    int serbestAtis;
private String link;
    public Basketbolcu() {

    }

    public Basketbolcu(String SporcuIsim, String sporcuTakim, int ikilik, int ucluk, int serbestAtis,String link) {
        super(SporcuIsim,sporcuTakim);
        this.basketbolcuAdi=SporcuIsim;
        this.basketbolcuTakim=sporcuTakim;
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
        this.link=link;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

 

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("basketbolcu adı: " + basketbolcuAdi + "basketbolcu takımı :" + basketbolcuTakim);
        System.out.println("İkilik: " + ikilik + "Üçlük: " + ucluk + "Serbest atış: " + serbestAtis);
    }
int sayac=0;
public boolean kartKullanildiMi(){
    if (sayac==0) {
        sayac++;
        return false;
    }
    else{
    return true;
    }

}
   public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
 }
