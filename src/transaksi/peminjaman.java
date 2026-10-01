package transaksi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Alat;
import model.mahasiswa;
import model.petugas;

public class peminjaman {
    private final String nomorPeminjaman;
    private final LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private final mahasiswa peminjam;
    private final petugas penyetuju;
    private final List<DetailPeminjaman> detail = new ArrayList<>();

    public peminjaman(String nomorPeminjaman, mahasiswa peminjam, petugas penyetuju) {
        this.nomorPeminjaman = nomorPeminjaman;
        this.peminjam = peminjam;
        this.penyetuju = penyetuju;
        this.tanggalPinjam = LocalDate.now();
    }

    public void tambahDetail(Alat alat, int jumlah) {
        detail.add(new DetailPeminjaman(alat, jumlah));
    }

    public List<DetailPeminjaman> getDetail() {
        return Collections.unmodifiableList(detail);
    }

    public int totalItem() {
        int total = 0;
        for (DetailPeminjaman d : detail) {
            total += d.getJumlah();
        }
        return total;
    }

    public String getNomorPeminjaman() { return nomorPeminjaman; }
    public LocalDate getTanggalPinjam() { return tanggalPinjam; }
    public LocalDate getTanggalKembali() { return tanggalKembali; }
    public mahasiswa getPeminjam() { return peminjam; }
    public petugas getPenyetuju() { return penyetuju; }
}