package kartoyunu;

public class Futbolcu extends Sporcu {

    private String futbolcuAdi;
    private String futbolcuTakim;
    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    private String link;
    private int sayac = 0;
    public Futbolcu() {

    }

    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya, String link) {
        super(sporcuIsim, sporcuTakim);
        this.futbolcuAdi = sporcuIsim;
        this.futbolcuTakim = sporcuTakim;
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
        this.link = link;

    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("futbolcu adı: " + futbolcuAdi + "futbolcu takımı :" + futbolcuTakim);
        System.out.println("Penaltı: " + penalti + "Serbest atış: " + serbestAtis + "Kaleci karşı karşıya: " + kaleciKarsiKarsiya);
    }
   
    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }
   

    public boolean kartKullanildiMi() {
        if (sayac == 0) {
            sayac++;
            return false;
        } else {
            return true;
        }

    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

  

}
