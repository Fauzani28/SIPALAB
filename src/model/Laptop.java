package model;

public class Laptop extends Alat implements terLacak {
    
    private int ramGB;
    private String nomorSeri;
    private String lokasiTerakhir;
    private boolean chargerLengkap;

    public Laptop(String kodeAlat, String nama, int tahunPerolehan, int ramGB, boolean chargerLengkap){
        this(kodeAlat, nama, tahunPerolehan, ramGB, chargerLengkap, "Tidak diketahui", "Laboratorium lantai 1");
    }

    public Laptop(String kodeAlat, String nama, int tahunPerolehan, int ramGB, boolean chargerLengkap, String nomorSeri, String lokasiTerakhir) {
        super(kodeAlat, nama, tahunPerolehan);
        this.ramGB = ramGB;
        this.chargerLengkap = chargerLengkap;
        this.nomorSeri = nomorSeri;
        this.lokasiTerakhir = lokasiTerakhir;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " - RAM: " + ramGB + " GB";
    }

    @Override
    public String nomorSeri() {
        return this.nomorSeri;
    }

    @Override
    public String lokasiTerakhir() {
        return this.lokasiTerakhir;
    }    
    @Override
    public boolean siapDipinjam() {
        return chargerLengkap;
    }
}