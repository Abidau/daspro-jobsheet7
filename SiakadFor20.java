import java.util.Scanner;
public class SiakadFor20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Percobaan
        // double nilai, tertinggi = 0, terendah = 100;


        // for (int i = 1; i <= 10; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
        //     nilai = sc.nextDouble();
        //     if (nilai > tertinggi) {
        //         tertinggi = nilai;
        //     }
        //     if (nilai < terendah) {
        //         terendah = nilai;
        //     }
        // }

        // System.out.println("Nilai tertinggi: " + tertinggi);
        // System.out.println("Nilai terendah: " + terendah);

        // Modifikasi
        int mahasiswa, lulus = 0, tidakLulus = 0, i;
        double nilai, tertinggi = 0, terendah = 100;

        System.out.print("Berapa jumlah mahasiswa : ");
        mahasiswa = sc.nextInt();

        for (i = 1; i <= mahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Banyaknya mahasiswa yang lulus : " + lulus);
        System.out.println("Banyaknya mahasiswa yang tidak lulus : " + tidakLulus);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}