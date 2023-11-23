import java.util.Scanner;
public class Percobaan616_Fungsi {
    static int hitunganLuas(int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume(int Tinggi, int a, int b){
        int volume = hitunganLuas(a,b)*Tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L, vol;
        System.out.println("Masukan Panjang: ");
        p =input.nextInt();
        System.out.println("Masukan lebar: ");
        l=input.nextInt();
        System.out.println("Masukan tinggi");
        t=input.nextInt();

        L=hitunganLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah: "+L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume Balok Adalah: "+vol);
    }
}
