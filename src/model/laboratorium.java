package model;

import java.util.ArrayList;
import java.util.List;

public class laboratorium {
    private final String kodeLab;
    private final String nama;
    private final List<Alat> koleksiAlat = new ArrayList<>();

    public laboratorium(String kodeLab, String nama) {
        this.kodeLab = kodeLab;
        this.nama = nama;
    }

    public void tambahAlat(Alat alat) {
        koleksiAlat.add(alat);
    }

    public int jumlahAlat() {
        return koleksiAlat.size();
    }

    // ===== TAMBAHAN =====
    public String getKodeLab() { return kodeLab; }
    public String getNama()    { return nama; }

    @Override
    public String toString() {
        return kodeLab + " - " + nama + " (" + jumlahAlat() + " alat)";
    }
}