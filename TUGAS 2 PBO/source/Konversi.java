import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Menggunakan BufferedReader untuk membaca input dari pengguna
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Meminta pengguna memasukkan jumlah detik
            System.out.print("Masukkan jumlah detik: ");
            int detik = Integer.parseInt(reader.readLine());

            // Meminta pengguna memilih jenis output
            System.out.println("Pilih jenis output:");
            System.out.println("1. Jam");
            System.out.println("2. Menit");
            System.out.println("3. Detik");
            System.out.println("4. Jam Menit Detik");
            System.out.print("Pilihan Anda: ");
            int pilihan = Integer.parseInt(reader.readLine());

            // Menghitung jam, menit, dan sisa detik
            int jam = detik / 3600;
            int sisaDetik = detik % 3600;
            int menit = sisaDetik / 60;
            int sisaDetikAkhir = sisaDetik % 60;

            // Menampilkan hasil konversi sesuai pilihan
            System.out.println("Hasil konversi:");

            switch (pilihan) {
                case 1:
                    System.out.println("Jam: " + jam);
                    break;
                case 2:
                    System.out.println("Menit: " + menit);
                    break;
                case 3:
                    System.out.println("Detik: " + sisaDetikAkhir);
                    break;
                case 4:
                    System.out.println("Jam: " + jam + ", Menit: " + menit + ", Detik: " + sisaDetikAkhir);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
            e.printStackTrace();
        }
    }
}