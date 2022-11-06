package weeks.week13;

public class Home {
    private double yuzolcumu;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajiVarMi;
    private long ucreti;
    private double kiraUcreti;
    private String cephe;
    private int yil;

    public Home() {
        this(0, 0, 0, false, 0, 0, "Yok", 0);
    }

    public Home(double yuzolcumu, int banyoSayisi, int odaSayisi, boolean garajiVarMi, long ucreti, double kiraUcreti, String cephe, int yil) {
        this.yuzolcumu = yuzolcumu;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajiVarMi = garajiVarMi;
        this.ucreti = ucreti;
        this.kiraUcreti = kiraUcreti;
        this.cephe = cephe;
        this.yil = yil;
    }

    public double getYuzolcumu() {
        return yuzolcumu;
    }

    public void setYuzolcumu(double yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public boolean isGarajiVarMi() {
        return garajiVarMi;
    }

    public void setGarajiVarMi(boolean garajiVarMi) {
        this.garajiVarMi = garajiVarMi;
    }

    public long getUcreti() {
        return ucreti;
    }

    public void setUcreti(long ucreti) {
        this.ucreti = ucreti;
    }

    public double getKiraUcreti() {
        return kiraUcreti;
    }

    public void setKiraUcreti(double kiraUcreti) {
        this.kiraUcreti = kiraUcreti;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void print() {
        System.out.println("yuzolcumu : " + this.yuzolcumu + " m2");
        System.out.println("banyoSayisi : " + this.banyoSayisi);
        System.out.println("odaSayisi : " + this.odaSayisi);
        System.out.println("garajiVarMi : " + (this.garajiVarMi ? "Var" : "Yok"));
        System.out.println("ucreti : " + this.ucreti + " $");
        System.out.println("kiraUcreti : " + this.kiraUcreti + " $");
        System.out.println("cephe : " + this.cephe);
        System.out.println("yil : " + this.yil);
    }
}
