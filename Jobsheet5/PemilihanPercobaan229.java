import java.util.Scanner;

public class PemilihanPercobaan229{
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = input29.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input29.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = input29.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = input29.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String nilaiHuruf = "A";
        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
        } else if (total > 73 && total <= 80) {
            nilaiHuruf = "B+";
        } else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C+";
        } else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
        } else if (total <= 39 && total < 0)  {
            nilaiHuruf = "E";
        } else {
            System.out.println("Masukkan Nilai Yang Sesuai :");
        }
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai Akhir = " + total + " dengan predikat " + nilaiHuruf + " sehingga " + message);
    }
}