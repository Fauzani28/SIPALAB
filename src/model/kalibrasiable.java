package model;
import java.time.LocalDate;

public interface kalibrasiable {
    boolean perluKalibrasi();

    LocalDate jatuhTempoKalibrasi();

    default String statusKalibrasi() {
        if (perluKalibrasi()) {
            return "Perlu kalibrasi dari : " + jatuhTempoKalibrasi();
        } else {
            return "Layak pakai sampai : " + jatuhTempoKalibrasi();
        }
    }
}
