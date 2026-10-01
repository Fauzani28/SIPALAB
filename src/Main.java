import java.time.LocalDate;
import model.Alat;
import model.Laptop;
import layanan.InventarisLab;
import model.Proyektor;
import model.Alatukur;
import model.HP;
import model.Komponen;
import model.mahasiswa;
import model.petugas;
import transaksi.peminjaman;
import transaksi.DetailPeminjaman;

public class Main {
    public static void main(String[] args) {
        Alat umum = new Alat("AL-001", "Kabel HDMI", 2021);
        Proyektor pro = new Proyektor("PJ-003", "Epson EB-X51", 2022, 3300, true);
        Laptop lap = new Laptop("LP-002", "Lenovo ThinkPad L14 G1", 2021, 8, true);
        Alatukur alatukur = new Alatukur("AU-004", "Multimeter", 2020, 500, "Volt", LocalDate.of(2025, 6, 1));
        HP hp = new HP("HP-005", "Samsung Galaxy S21", 2021, "Samsung", "Biru", 50000.0, true);

        InventarisLab inventaris = new InventarisLab();
        inventaris.tambah(new Laptop("LPT-01", "Laptop Asus", 2021, 8, true));
        inventaris.tambah(new Laptop("LPT-02", "Laptop Lenovo", 2022, 16, true));
        inventaris.tambah(new Proyektor("PRY-01", "Epson EB-X500", 2022, 3300, true));
        inventaris.tambah(new Alatukur("AUK-01", "Multimeter Digital", 2021, 500, "Volt", LocalDate.of(2025, 6, 1)));
        inventaris.tambah(new Komponen("KMP-01", "Resistor 10k", 2021, 100, 10));
        inventaris.tambah(new Komponen("KMP-02", "Kapasitor 100uF", 2022, 50, 5));
        inventaris.tambah(new Komponen("KMP-03", "Induktor 10mH", 2022, 2, 21));
        inventaris.tambah(new Alatukur("AUK-02", "Osiloskop", 2022, 100, "MHz", LocalDate.of(2025, 8, 1)));

        System.out.println(umum.deskripsi() + " | siap: " + umum.siapDipinjam());
        System.out.println(lap.deskripsi() + " | siap: " + lap.siapDipinjam());
        System.out.println(lap.nomorSeri() + " | lokasi: " + lap.lokasiTerakhir());
        System.out.println(pro.deskripsi() + " | siap: " + pro.siapDipinjam());
        System.out.println(pro.nomorSeri() + " | lokasi: " + pro.lokasiTerakhir());
        System.out.println(alatukur.deskripsi() + " | siap: " + alatukur.siapDipinjam());
        System.out.println(alatukur.statusKalibrasi());
        System.out.println(hp.deskripsi() + " | siap: " + hp.siapDipinjam());
        System.out.println(hp.namaAlat() + " | deposit: " + hp.deposit());

        System.out.println("\n=== Status Semua Alat ===");
        inventaris.cetakStatus();
        System.out.println("\n=== Jadwal Kalibrasi ===");
        inventaris.cetakJadwalKalibrasi();
        System.out.println("\n=== Jumlah Alat yang Siap Dipinjam ===");
        System.out.println(inventaris.hitungSiapDipinjam());
        System.out.println("\n=== Alat yang Tidak Siap ===");
        for (Alat a : inventaris.daftarTidakSiap()) {
            System.out.println(a.getNama() + " | siap: " + a.siapDipinjam());
        }

        System.out.println("\n=== SIMULASI PEMINJAMAN ===");

        mahasiswa mhs1 = new mahasiswa("231001", "Andi Saputra", "Teknik Informatika");
        petugas ptg1 = new petugas("PTG-001", "Rina Marlina");

        peminjaman trx1 = new peminjaman("TRX-001", mhs1, ptg1);
        trx1.tambahDetail(lap, 1);
        trx1.tambahDetail(pro, 2);

        System.out.println("Nomor Peminjaman : " + trx1.getNomorPeminjaman());
        System.out.println("Peminjam         : " + trx1.getPeminjam().getNama()
                + " (" + trx1.getPeminjam().getNim() + ")");
        System.out.println("Penyetuju        : " + trx1.getPenyetuju().getNama()
                + " (" + trx1.getPenyetuju().getNip() + ")");
        System.out.println("Tanggal Pinjam   : " + trx1.getTanggalPinjam());
        System.out.println("Detail Baris     :");
        for (DetailPeminjaman d : trx1.getDetail()) {
            System.out.println("  - " + d.baris());
        }
        System.out.println("Total Item       : " + trx1.totalItem());

        System.out.println("\n=== PEMINJAMAN KEDUA ===");

        mahasiswa mhs2 = new mahasiswa("231002", "Fachri", "Teknologi Rekayasa Perangkat Lunak");
        petugas ptg2 = new petugas("PTG-002", "Dedi Kurniawan");

        peminjaman trx2 = new peminjaman("TRX-002", mhs2, ptg2);
        trx2.tambahDetail(umum, 3);
        trx2.tambahDetail(hp, 1);

        System.out.println("Nomor Peminjaman : " + trx2.getNomorPeminjaman());
        System.out.println("Peminjam         : " + trx2.getPeminjam().getNama()
                + " (" + trx2.getPeminjam().getNim() + ")");
        System.out.println("Penyetuju        : " + trx2.getPenyetuju().getNama()
                + " (" + trx2.getPenyetuju().getNip() + ")");
        System.out.println("Tanggal Pinjam   : " + trx2.getTanggalPinjam());
        System.out.println("Detail Baris     :");
        for (DetailPeminjaman d : trx2.getDetail()) {
            System.out.println("  - " + d.baris());
        }
        System.out.println("Total Item       : " + trx2.totalItem());
        
    }
}