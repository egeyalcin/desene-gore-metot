import java.util.Scanner;

public class DesenFunc {
    static int oruntu() {
        int sayi,degisenSayi,ilkSayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        sayi = inp.nextInt();
        degisenSayi = sayi;
        ilkSayi = sayi;
        if (sayi > 0) {
            while (degisenSayi > 0) {
                System.out.print(" " + degisenSayi);
                degisenSayi = degisenSayi - 5;
            }
        }
        if (degisenSayi <= 0) {
            while (degisenSayi <= ilkSayi) {
                System.out.print(" " + degisenSayi);
                degisenSayi += 5;
            }
        }

        System.out.println();
        return oruntu();
    }
    public static void main(String[] args) {
        oruntu();
    }
}
