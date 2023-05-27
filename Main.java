import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double kg;
        double m;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextInt();

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz :");
        m = inp.nextInt();
        double ındeks = kg / m * m;

        System.out.println("Vücut kitle indeksiniz : " + ındeks);


    }
}
