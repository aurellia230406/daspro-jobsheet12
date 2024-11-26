import java.util.Scanner;
public class Tugas03 {
    public static int hitungTotalRekursif(int n) {
        if (n == 1) { 
            return 1;
        }
        return n + hitungTotalRekursif(n - 1);
    }
    public static int hitungTotalIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();

        int totalRekursif = hitungTotalRekursif(n);
        System.out.println("Hasil menggunakan fungsi rekursif: " + totalRekursif);

        int totalIteratif = hitungTotalIteratif(n);
        System.out.println("Hasil menggunakan fungsi iteratif: " + totalIteratif);

        scanner.close();
    }
}