import java.util.Scanner;

public class DosenMain10 {
    public static void main(String[] args) {
        Scanner sc       = new Scanner(System.in);
        DataDosen10 dd     = new DataDosen10();
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Semua Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort – usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Selection Sort – usia tertua ke termuda)");
            System.out.println("5. Insertion Sort (ASC – usia termuda ke tertua)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // bersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    Dosen10 d = new Dosen10(kode, nama, jk, usia);
                    dd.tambah(d);
                    System.out.println("Data dosen berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    dd.tampil();
                    break;

                case 3:
                    dd.sortingASC();
                    System.out.println("\n--- Data Dosen (Sorting ASC berdasarkan usia) ---");
                    dd.tampil();
                    break;

                case 4:
                    dd.sortingDSC();
                    System.out.println("\n--- Data Dosen (Sorting DSC berdasarkan usia) ---");
                    dd.tampil();
                    break;

                case 5:
                    dd.insertionSort();
                    System.out.println("\n--- Data Dosen (Insertion Sort ASC berdasarkan usia) ---");
                    dd.tampil();
                    break;

                case 0:
                    System.out.println("Program selesai. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
