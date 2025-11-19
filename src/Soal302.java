//Nama = Alya Fakhrun Nisa
//NIM = 254107060036
//Kelas = SIB 1A
//Soal ke 3
// Link Github : https://github.com/alyafakhrunnisa/kuis2

import java.util.Scanner;
public class Soal302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Konstanta untuk ukuran array
        final int Jumlah_hari = 7;
        final int Jumlah_produk = 4;

        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String[] namaProduk = {"Produk A", "Produk B", "Produk C", "Produk D"};

        // Simpan data penjualan dalam array 2D
        // penjualan[hari][produk]
        int[][] penjualan = new int[Jumlah_hari][Jumlah_produk];

        // Array 1D untuk menyimpan total penjualan per hari dan per produk
        int[] totalPenjualanPerHari = new int[Jumlah_hari];
        int[] totalPenjualanPerProduk = new int[Jumlah_produk];

        System.out.println("=================================================");
        System.out.println("INPUT DATA PENJUALAN MINGGUAN");
        System.out.println("=================================================");

        // Loop Bersarang untuk input
        for (int i = 0; i < Jumlah_hari; i++) { // Loop Hari
            System.out.println("--- Hari: " + namaHari[i] + " ---");
            for (int j = 0; j < Jumlah_produk; j++) { // Loop Produk
                System.out.print("  Masukkan unit terjual untuk " + namaProduk[j] + ": ");
                penjualan[i][j] = sc.nextInt();
                
                // Secara bersamaan, hitung total (sekuensial)
                totalPenjualanPerHari[i] += penjualan[i][j];
                totalPenjualanPerProduk[j] += penjualan[i][j];
            }
        }
        
        // Sediakan menu berulang
        int pilihan = 0;
        
        do {
            System.out.println("\n==================== MENU ANALISIS ====================");
            System.out.println("Menampilkan total penjualan per produk");
            System.out.println("Menampilkan total penjualan per hari");
            System.out.println("Menampilkan produk dengan penjualan tertinggi");
            System.out.println("Menampilkan hari dengan penjualan tertinggi");
            System.out.println("Keluar");
            System.out.println("=======================================================");
            System.out.print("Pilih opsi (1-5): ");
            pilihan = sc.nextInt();

            // Menggunakan switch (atau if-else) untuk menangani pilihan menu
            switch (pilihan) {
                case 1:
                    // Total penjualan per produk
                    System.out.println("\n--- TOTAL PENJUALAN PER PRODUK ---");
                    for (int j = 0; j < Jumlah_produk; j++) {
                        System.out.println(namaProduk[j] + ": " + totalPenjualanPerProduk[j] + " unit");
                    }
                    break;
                
                case 2:
                    // Total penjualan per hari
                    System.out.println("\n--- TOTAL PENJUALAN PER HARI ---");
                    for (int i = 0; i < Jumlah_hari; i++) {
                        System.out.println(namaHari[i] + ": " + totalPenjualanPerHari[i] + " unit");
                    }
                    break;
                
                case 3:
                    // Produk dengan penjualan tertinggi
                    int maxProduk = -1;
                    int maxUnit = -1;
                    String namaMaxProduk = "";
                    
                    for (int j = 0; j < Jumlah_produk; j++) {
                        if (totalPenjualanPerProduk[j] > maxUnit) {
                            maxUnit = totalPenjualanPerProduk[j];
                            namaMaxProduk = namaProduk[j];
                        }
                    }
                    System.out.println("\n--- PRODUK TERLARIS ---");
                    System.out.println(namaMaxProduk + " dengan total " + maxUnit + " unit.");
                    break;

                case 4:
                    // Hari dengan penjualan tertinggi
                    int maxHari = -1;
                    int maxUnitHari = -1;
                    String namaMaxHari = "";
                    
                    for (int i = 0; i < Jumlah_hari; i++) {
                        if (totalPenjualanPerHari[i] > maxUnitHari) {
                            maxUnitHari = totalPenjualanPerHari[i];
                            namaMaxHari = namaHari[i];
                        }
                    }
                    System.out.println("\n--- HARI PENJUALAN TERTINGGI ---");
                    System.out.println(namaMaxHari + " dengan total " + maxUnitHari + " unit.");
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("\nProgram diakhiri. Terima kasih!");
                    break;

                default:
                    System.out.println("\nOpsi tidak valid. Silakan pilih 1 sampai 5");
            }

        } while (pilihan != 5);

        sc.close();
    }
}
