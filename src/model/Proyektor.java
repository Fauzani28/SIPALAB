package model;

public class Proyektor extends Alat implements terLacak {
    private int resolusi;
    private boolean konektivitasLengkap;
    private String lokasiTerakhir;
    private String nomorSeri;

    // Konstruktor utama (lengkap)
    public Proyektor(String kodeAlat, String nama, int tahunPerolehan,
                     int resolusi, boolean konektivitasLengkap,
                     String lokasiTerakhir, String nomorSeri, String keterangan) {
        super(kodeAlat, nama, tahunPerolehan);
        this.resolusi = resolusi;
        this.konektivitasLengkap = konektivitasLengkap;
        this.lokasiTerakhir = lokasiTerakhir;
        this.nomorSeri = nomorSeri;
    }

    // Konstruktor ringkas (delegasi ke konstruktor utama)
    public Proyektor(String kodeAlat, String nama, int tahunPerolehan,
                     int resolusi, boolean konektivitasLengkap) {
        this(kodeAlat, nama, tahunPerolehan, resolusi, konektivitasLengkap,
             "Tidak diketahui", "-", "-");
    }

    @Override
    public String deskripsi() {
        return super.deskripsi()
                + " - Resolusi: " + resolusi + " px"
                + ", Konektivitas Lengkap: " + (konektivitasLengkap ? "Ya" : "Tidak")
                + ", Lokasi Terakhir: " + lokasiTerakhir
                + ", No. Seri: " + nomorSeri;
    }

    @Override
    public boolean siapDipinjam() {
        return konektivitasLengkap;
    }
    @Override
    public String nomorSeri() {
        return this.nomorSeri;
    }

@Override
public String lokasiTerakhir() {
    return this.lokasiTerakhir;
}

    // Getter & Setter opsional
    public int getResolusi() { return resolusi; }
    public void setResolusi(int resolusi) { this.resolusi = resolusi; }

    public boolean isKonektivitasLengkap() { return konektivitasLengkap; }
    public void setKonektivitasLengkap(boolean k) { this.konektivitasLengkap = k; }

    public String getLokasiTerakhir() { return lokasiTerakhir; }
    public void setLokasiTerakhir(String l) { this.lokasiTerakhir = l; }

    public String getNomorSeri() { return nomorSeri; }
    public void setNomorSeri(String n) { this.nomorSeri = n; }
}