import java.util.Scanner;

public class Logicalcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input dari pengguna
     System.out.println("=========== SISTEM LOGICAL FASTSEND ==========");

        System.out.print("Masukkan Nama Klien : ");
        String namaklien = input.nextLine();

        System.out.print("Masukkan Berat(kg)(cth: 0,5) : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Jarak(km) : ");
        int jarak = input.nextInt();

        System.out.print("Masukkan Total box/kardus : ");
        int box = input.nextInt();

    int Tarif = (15000 * jarak);
    double Berat = (5500 * berat);
    double Biayadasar = (Tarif + Berat);
    double asuransi = (Biayadasar * 0.035);
    double Totalbiaya = (Biayadasar + asuransi);

    System.out.println("======= RESI PENGIRIMAN =======");
        
        System.out.println("klien : " + namaklien );
        System.out.println("Total Box: " + box + " box " );
        System.out.println("Kebutuhan Armada: " + (box / 150) + " Truk Penuh dan sisa " + (box % 150) + " box via Pickup.");
        System.out.println("Estimasi Waktu : " + (jarak/60) + " jam " + (jarak%60) + " menit ");
    
    System.out.println("=== RINCIAN BIAYA ===");
        System.out.println("Biaya Dasar : Rp " + Biayadasar);
        System.out.println("Biaya Asuransi : Rp " + asuransi);
        System.out.println("----------------------------------" );
        System.out.println("Total Biaya : Rp " + Totalbiaya);
        System.out.println("====================================");

    

        
    }
}
