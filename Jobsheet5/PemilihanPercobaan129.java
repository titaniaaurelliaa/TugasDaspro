import java.util.Scanner;

public class PemilihanPercobaan129{
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);

        System.out.println("Masukkan Angka");
        int angka = input29.nextInt();

        String hasil;
        hasil = (angka > 0.0) ? "Bilangan Positif" : "Bilangan Negatif";
        System.out.println(angka+ " adalah " + hasil);
    }
}