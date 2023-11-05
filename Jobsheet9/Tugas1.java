package Jobsheet9;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();
 
        // Inisialisasi array
        int [] array = new int[n];
 
        // Input nilai elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
 
        // Menghitung nilai tertinggi, nilai terendah, dan rata-rata
        if (n == 0) {
            System.out.println("Array kosong. Tidak dapat menghitung nilai tertinggi, terendah, dan rata-rata.");
        } else {
            int nilaiTerbesar = array[0];
            int nilaiTerkecil = array[0];
            int total = array[0];
 
            for (int i = 1; i < n; i++) {
                if (array[i] > nilaiTerbesar) {
                    nilaiTerbesar = array[i];
                }
                if (array[i] < nilaiTerkecil) {
                    nilaiTerkecil = array[i];
                }
                total += array[i];
            }
 
            double ratarata = (double) total / n;
 
            System.out.println("Nilai tertinggi : " + nilaiTerbesar);
            System.out.println("Nilai terendah : " + nilaiTerkecil);
            System.out.println("Rata-rata : " + ratarata);
        }
    }
}
