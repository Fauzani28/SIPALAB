package model;

public class mahasiswa {

    private String nim;
    private String nama;
    private String programStudi;

    public mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public String toString() {
        return nim + " - " + nama + " (" + programStudi + ")";
    }
}