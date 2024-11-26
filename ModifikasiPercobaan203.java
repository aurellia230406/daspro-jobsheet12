import java.util.Scanner;

public class ModifikasiPercobaan203 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            if (y == 1) {
                System.out.print(x + "x");
            } else {
                System.out.print(x + "x");
            }
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.print("Hasil: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        
        System.out.println("1 = " + hasil); 

        sc.close();
    }
}