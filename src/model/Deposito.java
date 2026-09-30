package model;

public interface Deposito {
    String namaAlat();
    double deposit();

    default String infoDeposit() {
        return "HP " + namaAlat() + " memerlukan deposit Rp" + deposit();
    }
}