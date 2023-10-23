import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKilo = input1.nextDouble();
        double armutToplam = armutKilo * 2.14;

        Scanner input2 = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = input2.nextDouble();
        double elmaToplam = elmaKilo * 3.67;

        Scanner input3 = new Scanner(System.in);
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKilo = input3.nextDouble();
        double domatesToplam = domatesKilo * 1.11;

        Scanner input4 = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo ? : ");
        muzKilo = input4.nextDouble();
        double muzToplam = muzKilo * 0.95;

        Scanner input5 = new Scanner(System.in);
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKilo = input5.nextDouble();
        double patlicanToplam = patlicanKilo * 5.00;

        double toplam = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;

        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}
