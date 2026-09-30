package model;
public interface terLacak {
    String nomorSeri ();
    String lokasiTerakhir ();

    default String ringkasanLacak() {
        return "Nomor Seri: " + nomorSeri() + ", Lokasi Terakhir: " + lokasiTerakhir();
    }
} //dari dosen