//*13020220149, Muh. Faizal ,Minggu 2 Maret 2024*//

import java.io.*;
public class Input2 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama     : ");
        String Nama = input.readLine();
        System.out.print("Masukkan Nim      : ");
        String Nim = input.readLine();
        System.out.print("Masukkan Jurusan  : ");
        String Jurusan = input.readLine();
        System.out.print("Masukkan Fakultas : ");
        String Fakultas = input.readLine();
        System.out.println("\n");
        System.out.println("Nama     : "+ Nama);
        System.out.println("Nim      : "+ Nim);
        System.out.println("Jurusan  : "+ Jurusan);
        System.out.println("Fakultas : "+ Fakultas);

    }
}