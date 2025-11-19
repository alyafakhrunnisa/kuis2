//Nama = Alya Fakhrun Nisa
//NIM = 254107060036
//Kelas = SIB 1A
//Soal ke 2
// Link Github : https://github.com/alyafakhrunnisa/kuis2

import java.util.Scanner;

public class Soal202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Meminta input: Jumlah kota (k) dan Jumlah hari (h)
        System.out.println("=================================");
        System.out.print("Program Analisis Suhu Kota\n");
        System.out.println("=================================");

        System.out.print("Masukkan jumlah kota (k): ");
        int k = sc.nextInt();
        System.out.print("Masukkan jumlah hari (h): ");
        int h = sc.nextInt();

        //mendeklarasikan double array untuk menyimpan suhu
        double[][] suhu = new double[k][h];

        // menyimpan rata-rata suhu tiap kota
        double[] rataRataKota = new double[k];
        System.out.println( "\n------Membaca data suhu--------");

        // Membaca data suhu setiap kota selama h hari (Loop Bersarang)
        for (int i = 0; i < k; i++) { // Loop Luar: Mengiterasi kota (i)
            System.out.println("Data Suhu Kota " + (i + 1) + ":");
            for (int j = 0; j < h; j++) { // Loop Dalam: Mengiterasi hari (j)
                System.out.printf("  Hari ke-%d: ", (j + 1));
                suhu[i][j] = sc.nextDouble();
            }
        }

        // --- Menghitung dan Menampilkan Suhu Max, Min, dan Rata-rata ---
        
        System.out.println("\n--- HASIL ANALISIS SUHU PER KOTA ---");
        
        // Variabel untuk melacak rata-rata terendah dan tertinggi secara keseluruhan (Langkah 5)
        double maxRataRata = Double.MIN_VALUE;
        double minRataRata = Double.MAX_VALUE;
        int kotaMax = -1;
        int kotaMin = -1;

        for (int i = 0; i < k; i++) { // Loop Luar: Iterasi Kota
            double sumSuhu = 0;
            double maxSuhu = Double.MIN_VALUE; // Inisialisasi Suhu Maksimum
            double minSuhu = Double.MAX_VALUE; // Inisialisasi Suhu Minimum

            for (int j = 0; j < h; j++) { // Loop Dalam: Iterasi Hari
                double currentSuhu = suhu[i][j];
                sumSuhu += currentSuhu;

                // Menentukan Suhu Maksimum (menggunakan if)
                if (currentSuhu > maxSuhu) {
                    maxSuhu = currentSuhu;
                }

                // Menentukan Suhu Minimum (menggunakan if)
                if (currentSuhu < minSuhu) {
                    minSuhu = currentSuhu;
                }
            }
            
            // Hitung Rata-rata Suhu
            double rataRata = sumSuhu / h;
            rataRataKota[i] = rataRata; // Simpan rata-rata untuk langkah 5

            // Tampilkan hasil per kota (Langkah 4)
            System.out.printf("\nKota %d:\n", (i + 1));
            System.out.printf("  Suhu Maksimum : %.2f\n", maxSuhu);
            System.out.printf("  Suhu Minimum  : %.2f\n", minSuhu);
            System.out.printf("  Rata-rata Suhu: %.2f\n", rataRata);

            // --- Menentukan Kota Rata-rata Terendah/Tertinggi (Dalam Loop) ---
            
            // Menentukan Kota dengan Rata-rata Tertinggi
            if (rataRata > maxRataRata) {
                maxRataRata = rataRata;
                kotaMax = i + 1;
            }

            // Menentukan Kota dengan Rata-rata Terendah
            if (rataRata < minRataRata) {
                minRataRata = rataRata;
                kotaMin = i + 1;
            }
        }

        //Menampilkan Hasil Akhir 

        System.out.printf("Kota dengan Rata-rata Suhu TERTINGGI: Kota %d (%.2f)\n", kotaMax, maxRataRata);
        System.out.printf("Kota dengan Rata-rata Suhu TERENDAH: Kota %d (%.2f)\n", kotaMin, minRataRata);
        System.out.println("=============================================");

        sc.close();
    




    }

    
}