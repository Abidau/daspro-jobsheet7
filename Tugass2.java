import java.util.Scanner;

public class Tugass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPembayaran = 0, pembayaran, jenisKendaraan, durasiParkir;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            } if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Input tidak valid, silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan durasi parkir dalam jam: ");
            durasiParkir = sc.nextInt();

            if (durasiParkir > 5) {
                totalPembayaran += 12500;
            } 

            if (jenisKendaraan == 1) { // Mobil
                totalPembayaran = durasiParkir * 3000;
                System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
            } else if (jenisKendaraan == 2) { // Motor
                totalPembayaran = durasiParkir * 2000;
                System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
            }
        }
    }
}
