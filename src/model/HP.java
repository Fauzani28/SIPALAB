package model;

public class HP extends Alat implements Deposito {
    private String merek;
    private String warna;
    private double hargaDeposit;
    private boolean tersedia;

    // Konstruktor utama
    public HP(String kodeAlat, String nama, int tahunPerolehan,
              String merek, String warna,
              double hargaDeposit, boolean tersedia) {
        super(kodeAlat, nama, tahunPerolehan);
        this.merek = merek;
        this.warna = warna;
        this.hargaDeposit = hargaDeposit;
        this.tersedia = tersedia;
    }

    // Konstruktor ringkas
    public HP(String kodeAlat, String nama, int tahunPerolehan,
              String merek, double hargaDeposit) {
        this(kodeAlat, nama, tahunPerolehan, merek,
             "Tidak diketahui", hargaDeposit, true);
    }

    @Override
    public String deskripsi() {
        return super.deskripsi()
                + " - Merek: " + merek
                + ", Warna: " + warna
                + ", Deposit: Rp" + hargaDeposit
                + ", Tersedia: " + (tersedia ? "Ya" : "Tidak");
    }

    @Override
    public boolean siapDipinjam() {
        return tersedia;
    }

    // ===== Implementasi Deposito =====
    @Override
    public String namaAlat() {
        return merek;
    }

    @Override
    public double deposit() {
        return hargaDeposit;
    }

    // ===== Getter & Setter =====
    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public double getHargaDeposit() { return hargaDeposit; }
    public void setHargaDeposit(double d) { this.hargaDeposit = d; }

    public boolean isTersedia() { return tersedia; }
    public void setTersedia(boolean t) { this.tersedia = t; }
}