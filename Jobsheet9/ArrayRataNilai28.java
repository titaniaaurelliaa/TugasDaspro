package Jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        int[]nilaiMhs=new int[jumlahMahasiswa];
        int total = 0;
        double ratarata;
        int banyakLulus = 0;
        int banyakTidakLulus = 0;

        for(int i=0;i<jumlahMahasiswa;i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+1)+" :");
            nilaiMhs[i]=input.nextInt();
        }

        for(int i = 0;i<jumlahMahasiswa;i++){
            if (nilaiMhs[i] > 70) {
                banyakLulus++;
            } else {
                banyakTidakLulus++;
            }
        }

        int[]nilaiLulus = new int[banyakLulus];
        int[]nilaiTidakLulus = new int[banyakTidakLulus];

        int j = 0;
        int k = 0;
        for(int i = 0;i<jumlahMahasiswa;i++){
            if (nilaiMhs[i] > 70) {
                nilaiLulus[j] = nilaiMhs[i];
                j++;
            } else {
                nilaiTidakLulus[k] = nilaiMhs[i];
                k++;
            }
        }

        double totalLulus = 0;
        for(int i = 0;i<banyakLulus;i++){
            totalLulus += nilaiLulus[i];
        }

        double totalTidakLulus = 0;
        for(int i = 0;i<banyakTidakLulus;i++){
            totalTidakLulus += nilaiTidakLulus[i];
        }

        ratarata = totalLulus / banyakLulus;
        System.out.println("Rata rata nilai mahasiswa yang lulus =  "+ratarata);

        ratarata = totalTidakLulus / banyakTidakLulus;
        System.out.println("Rata rata nilai mahasiswa yang tidak lulus =  "+ratarata);
    }
}