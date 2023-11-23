import java.util.Scanner;
public class Kubus16 {
 static int luasPermukaan(int sisi){
    int permukaan = sisi*sisi*6;
    return permukaan;
 }  
 static int HitungVolume(int sisi){
    int volume= sisi*sisi*sisi;
    return volume;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sisi, permukaan, vol;
    System.out.println("Masukan sisi kubus: ");
    sisi = sc.nextInt();

    permukaan = luasPermukaan(sisi);
    System.out.println("Luas Permukaan Kubus Adalah : "+permukaan);
    vol = HitungVolume(sisi);
    System.out.println("Volume Kubus Adalah : "+ vol);
 }
}
