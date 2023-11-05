package Jobsheet7;
import java.util.Scanner;

public class forkelipatan28 {
    public static void main(String[] args) {
        int kelipatan,jumlah=0,counter=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan kelipatan 1-9 : ");
        kelipatan=scan.nextInt();

        for(int i = 1; i<=50; i++){
            if(i%kelipatan==0){
                jumlah+=i;
                counter++;
            }
        }
        
        double ratarata;
        ratarata = jumlah/counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan,jumlah);
        System.out.printf("Rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f",kelipatan,ratarata);
    }
}