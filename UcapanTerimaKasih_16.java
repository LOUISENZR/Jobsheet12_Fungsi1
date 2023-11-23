import java.util.Scanner;
public class UcapanTerimaKasih_16 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin andda beri ucapan");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static String UcapanTambahan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Berikan Pesan Ucapan : ");
        String ucapan= sc.nextLine();
        return ucapan;
    }
    
     public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        String ucapan = UcapanTambahan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like i could ask you anything.\n"+ucapan);
        
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}
