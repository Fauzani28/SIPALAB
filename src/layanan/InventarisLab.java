package layanan;

import java.util.ArrayList;
import java.util.List;
import model.Alat;
// import model.Laptop;
// import model.Proyektor;
// import model.Alatukur;
import model.kalibrasiable;

public class InventarisLab {
    private final List<Alat> daftarAlat = new ArrayList<>();

    public void tambah(Alat alat) {
        daftarAlat.add(alat);
    }

    // ---------method lama-------------
    // public void cetakStatusBercabang() {
    //     for (Alat a : daftarAlat) {
    //         if (a instanceof Laptop) {
    //             Laptop l = (Laptop) a;
    //             System.out.println(l.getNama() + " " + l.siapDipinjam());
    //         } else if (a instanceof Proyektor) {
    //             Proyektor p = (Proyektor) a;
    //             System.out.println(p.getNama() + " " + p.siapDipinjam());
    //         } else if (a instanceof Alatukur) {
    //             Alatukur u = (Alatukur) a;
    //             System.out.println(u.getNama() + " " + u.siapDipinjam());
    //         }
    //     }
    // }

    public void cetakStatus() {
    for (Alat a : daftarAlat) {
        System.out.println(a.laporanRingkas());
    }
}
    public void cetakJadwalKalibrasi() {
    for (Alat a : daftarAlat) {
    if (a instanceof kalibrasiable k) {
    System.out.println(a.getNama() + "  " + k.statusKalibrasi());
    }
    }
}
    public int hitungSiapDipinjam() {
    int jumlah = 0;
    for (Alat a : daftarAlat) {
        if (a.siapDipinjam()) {
            jumlah++;
        }
    }
    return jumlah;
}
    public List<Alat> daftarTidakSiap() {
    List<Alat> hasil = new ArrayList<>();
    for (Alat a : daftarAlat) {
        if (!a.siapDipinjam()) {
            hasil.add(a);
        }
    }
    return hasil;
}
    public List<Alat> semuaAlat() {
        return daftarAlat;
    }
    
}