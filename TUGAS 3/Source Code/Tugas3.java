//13020220149, Muh. Faizal, Senin 12 Maret 2024
import java.util.Scanner;
public class Tugas3{
        /**
         * @param args
         */
        public static void main(String[] args) {
// TODO Auto-generated method stub
            /* Kamus */
            Scanner masukan = new Scanner(System.in);
            int a;
            /* Program */
            System.out.print("Contoh IF satu kasus \n");
            System.out.print("Ketikkan suatu nilai integer : ");
            a = masukan.nextInt();
            if (a >= 0)
                System.out.print("\nNilai a positif " + a);
        }
    }