import java.util.Scanner;
public class Tugass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000, i, tiket;
        int totalTiket = 0;
        double totalPenjualan = 0, hargaTransaksi;
        
        System.out.print("Masukkan transaksi hari ini: ");
        int jumlahTiket = sc.nextInt(); 

        for (i = 1; i <= jumlahTiket; i++) {
            do {
                System.out.print("Masukkan jumlah tiket yang dibeli pada transaksi ke-" + i + ": ");
                tiket = sc.nextInt();

                if (tiket < 0) {
                    System.out.println("Invalid, Mohon masukkan angka Positif.");
                }
            } while (tiket < 0);

            hargaTransaksi = tiket * hargaTiket;
            
            if (tiket > 10) {
                hargaTransaksi *= 0.85; 
            } else if (tiket > 4) {
                hargaTransaksi *= 0.90; 
            }
            totalTiket += tiket;
            totalPenjualan += hargaTransaksi;
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalPenjualan);
    }
}
