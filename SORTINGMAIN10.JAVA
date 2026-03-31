
public class SORTINGMAIN10 {
    public static void main(String[] args) {

        // Bubble Sort
        int a[] = {20, 10, 2, 7, 12};
        SORTING10 dataurut1 = new SORTING10(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println();

        // Selection Sort
        int b[] = {30, 20, 2, 8, 14};
        SORTING10 dataurut2 = new SORTING10(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println();

        // Insertion Sort
        int c[] = {40, 10, 4, 9, 3};
        SORTING10 dataurut3 = new SORTING10(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}