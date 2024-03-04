//*13020220149, Muh. Faizal ,Minggu 2 Maret 2024*//
import java.util.Scanner;
public class Input1{
    public static void main(String[] args) {
        String Nama, Nim, Jurusan, Fakultas;
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Nama     : ");
        Nama = Input.nextLine();
        System.out.print("Masukkan Nim      : ");
        Nim = Input.nextLine();
        System.out.print("Masukkan Jurusan  : ");
        Jurusan = Input.nextLine();
        System.out.print("Masukkan Fakultas : ");
        Fakultas = Input.nextLine();
        System.out.println("\n");
        System.out.println("Nama     : "+ Nama);
        System.out.println("Nim      : "+ Nim);
        System.out.println("Jurusan  : "+ Jurusan);
        System.out.println("Fakultas : "+ Fakultas);

    }
}