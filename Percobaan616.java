import java.util.Scanner;
public class Percobaan616 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukan Panjang: ");
        p=input.nextInt();
        System.out.println("Masukan Leba: ");
        l=input.nextInt();
        System.out.println("Masukan Tinggi : ");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas Persegi Panjang Adalah: "+L);

        vol=p*l*t;
        System.out.println("Volime Balok AAdalah: "+vol);
    }
    
}
