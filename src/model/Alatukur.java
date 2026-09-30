package model;

import java.time.LocalDate;

public class Alatukur extends Alat implements kalibrasiable {

    private int kapasitas;
    private String satuan;
    private LocalDate kalibrasiTerakhir;

    public Alatukur(String kodeAlat, String nama, int tahunPerolehan, int kapasitas, String satuan, LocalDate kalibrasiTerakhir) {
        super(kodeAlat, nama, tahunPerolehan);
        this.kapasitas = kapasitas;
        this.satuan = satuan;
        this.kalibrasiTerakhir = kalibrasiTerakhir;
    }

    @Override
    public boolean perluKalibrasi() {
        return kalibrasiTerakhir.isBefore(LocalDate.now().minusMonths(6));
    }

    @Override
    public LocalDate jatuhTempoKalibrasi() {
        return kalibrasiTerakhir.plusMonths(6);
    }

    @Override
    public boolean siapDipinjam() {
        return !perluKalibrasi();
    }

    @Override
    public String deskripsi(){
        return super.deskripsi() + " - Kapasitas: " + kapasitas + " " + satuan + " (Kalibrasi Terakhir: " + kalibrasiTerakhir + ")";
    }
}