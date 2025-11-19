//Nama = Alya Fakhrun Nisa
//NIM = 254107060036
//Kelas = SIB 1A
//Soal ke 1
// Link Github : https://github.com/alyafakhrunnisa/kuis2
import java.util.Scanner;
public class Soal102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // meminta input jumlah elemen (n)
        System.out.println("=================================");
        System .out.print("Program Analisis Genap dan Ganjil (max 5 elemen)\n");
        System.out.println("=================================");
        System.out.print("Masukkan jumlah elemen (max 5): ");
        int n = sc.nextInt();

        int N; // membatasi n maksimal 5
        n = ( n > 5 ) ? 5 : n;
        System.out.println("Memproses " + n + " elemen pertama");
        int[] arr = new int[5];

        System.out.print("masukkan bilangan ke-1:");
        arr[0] = sc.nextInt();
        System.out.print("masukkan bilangan ke-2:");
        arr[1] = sc.nextInt();
        System.out.print("masukkan bilangan ke-3:");
        arr[2] = sc.nextInt();
        System.out.print("masukkan bilangan ke-4:");
        arr[3] = sc.nextInt();
        System.out.print("masukkan bilangan ke-5:");
        arr[4] = sc.nextInt();
        
        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        int c1_g = (1 - Math.abs(arr[0] % 2));
        int c1_j = Math.abs(arr[0] % 2);
        
        int c2_g = (1 - Math.abs(arr[1] % 2));
        int c2_j = Math.abs(arr[1] % 2);

        int c3_g = (1 - Math.abs(arr[2] % 2));
        int c3_j = Math.abs(arr[2] % 2);
        
        int c4_g = (1 - Math.abs(arr[3] % 2));
        int c4_j = Math.abs(arr[3] % 2);

        int c5_g = (1 - Math.abs(arr[4] % 2));
        int c5_j = Math.abs(arr[4] % 2);

        // Menjumlahkan total hitungan (Langkah Berurutan)
        jumlahGenap = c1_g + c2_g + c3_g + c4_g + c5_g;
        jumlahGanjil = c1_j + c2_j + c3_j + c4_j + c5_j;

        String daftarGenap = // Membuat String Daftar Genap
            (c1_g * arr[0]) + " " + 
            (c2_g * arr[1]) + " " + 
            (c3_g * arr[2]) + " " + 
            (c4_g * arr[3]) + " " + 
            (c5_g * arr[4]);

        String daftarGanjil = //    Membuat String Daftar Ganjil
            (c1_j * arr[0]) + " " + 
            (c2_j * arr[1]) + " " + 
            (c3_j * arr[2]) + " " + 
            (c4_j * arr[3]) + " " + 
            (c5_j * arr[4]);
            System.out.println("\n====================== HASIL =======================");
        System.out.println("Jumlah Bilangan Genap\t: " + jumlahGenap);
        System.out.println("Jumlah Bilangan Ganjil\t: " + jumlahGanjil);
        System.out.println("--------------------------------------------------");
        System.out.println("Daftar Genap \t: " + daftarGenap);
        System.out.println("Daftar Ganjil \t: " + daftarGanjil);
        System.out.println("==================================================");
    }
}