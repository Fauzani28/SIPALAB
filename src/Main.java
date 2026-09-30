import java.time.LocalDate;
import model.Alat;
import model.Laptop;
import layanan.InventarisLab;
import model.Proyektor;
import model.Alatukur;
import model.HP;
import model.Komponen;

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
    } 
}



//         [fachri@archlinux src]$ cd "/mnt/data/Documents/Projects/PBO 2/SIPALAB/src/" && javac Main.java && java Main
// Main.java:20: error: cannot find symbol
//         System.out.println(alatukur.ringkasanLacak());
//                                    ^
//   symbol:   method ringkasanLacak()
//   location: variable alatukur of type Alatukur
// 1 error