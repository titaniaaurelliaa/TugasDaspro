import java.util.Scanner;

public class Pemilihan2Percobaan229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        int totalSudut;

        System.out.print("Masukkan angka untuk sudut 1 segitiga : ");
        int sudut1 = input29.nextInt();
        System.out.print("Masukkan angka untuk sudut 2 segitiga : ");
        int sudut2 = input29.nextInt();
        System.out.print("Masukkan angka untuk sudut 3 segitiga : ");
        int sudut3 = input29.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku - siku");
            else if(sudut1 == sudut2 && sudut1 == sudut3)
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if((sudut1 == sudut2) || (sudut1 == sudut3)|| (sudut2 == sudut3)) 
            System.out.println("Sgitiga tersebut adalah segitiga sama kaki");
            else if(sudut1 != sudut2 && sudut1 != sudut3)
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
        System.out.println("Bukan segitiga");
    }
}
