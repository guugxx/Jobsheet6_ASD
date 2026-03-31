public class DataDosen10 {
    Dosen10[] DataDosen10 = new Dosen10[10];
    int idx;

    void tambah(Dosen10 dsn) {
        if (idx < DataDosen10.length) {
            DataDosen10[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            DataDosen10[i].tampil();
            System.out.println("------------------------------");
        }
    }

    // Bubble Sort – ASC berdasarkan usia (termuda ke tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (DataDosen10[j - 1].usia > DataDosen10[j].usia) {
                    Dosen10 tmp        = DataDosen10[j];
                    DataDosen10[j]     = DataDosen10[j - 1];
                    DataDosen10[j - 1] = tmp;
                }
            }
        }
    }

    // Selection Sort – DSC berdasarkan usia (tertua ke termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (DataDosen10[j].usia > DataDosen10[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen10 tmp          = DataDosen10[idxMax];
            DataDosen10[idxMax]  = DataDosen10[i];
            DataDosen10[i]       = tmp;
        }
    }

    // Insertion Sort – ASC berdasarkan usia
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen10 temp = DataDosen10[i];
            int j = i;
            while (j > 0 && DataDosen10[j - 1].usia > temp.usia) {
                DataDosen10[j] = DataDosen10[j - 1];
                j--;
            }
            DataDosen10[j] = temp;
        }
    }
}