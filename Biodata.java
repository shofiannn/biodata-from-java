import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIS : ");
        String nis = scanner.nextLine();
        System.out.print("Masukkan nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kelamin P / L : ");
        String kelamin = scanner.nextLine();
        System.out.print("Masukkan umur : ");
        String umur = scanner.nextLine();

        scanner.close();

        System.out.println ("=================");
        System.out.println("    BIODATA     ");
        System.out.println("===================");
        System.out.println("NIS : " + nis);
        System.out.println("Nama : " + nama);
        System.out.println("Kelamin : " + kelamin);
        System.out.println("Umur : " + umur);
    }
}