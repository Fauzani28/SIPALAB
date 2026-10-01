package model;

public class petugas {

    private String nip;
    private String nama;

    public petugas(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nip + " - " + nama;
    }
}