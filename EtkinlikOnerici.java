import java.util.Scanner;
public class EtkinlikOnerici {
    public static void main(String[] args) {
// kullanıcıdan alınan hava sıcaklıgı değeriyle koşullu olarak aktivite önerisi yapıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklık derecesini giriniz :  ");
        double heat = input.nextDouble();
        // Önerilen aktiviteler yazısı if-else komutlarından önce yazıldığı için her değer için ortak yazdırılacak.
        System.out.println("----Önerilen Aktiviteler---- ");
        if(heat<5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        } else if (heat>=5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat>=15 && heat < 25) {
            System.out.println("Piknik yapmaya gidebilirsiniz");
            System.out.println("Sinemaya gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
