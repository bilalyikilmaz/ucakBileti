import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        //Değişkenler
        int age, type;
        double distance, total;
        boolean isError = false;
        Scanner input;

        //Kullanıcı Veri Girişi
        input = new Scanner(System.in);
        System.out.print("Mesafeyi km Cinsinden Giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk Tİpini Giriniz (1- Tek Yön, 2- Gidiş Dönüş) : ");
        type = input.nextInt();

        //Hesaplamalar & Kontroller
        if (distance > 0 && age > 0 && type == 1 || type == 2) {
// Normal Ücret Hesabı
            total = 0.1 * distance;
            if (age < 12) {
                total = total * 0.5;
                if (type == 1) {
                    total = total;
                } else {
                    total = total * 0.8 * 2;
                }
            } else if (age > 12 && age < 24) {
                total = total * 0.9;
                if (type == 1) {
                    total = total;
                } else {
                    total = total * 0.8 * 2;
                }
            } else if (age > 65) {
                total = total * 0.7;
                if (type == 1) {
                    total = total;
                } else {
                    total = total * 0.8 * 2;
                }
            }
            System.out.println("Toplam Tutar : " + total);
        } else {
            System.out.println("Hatalı Veri girdiniz!");
        }

    }
}
