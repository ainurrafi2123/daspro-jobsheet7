import java.util.Scanner;

public class SiakadFor17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i, lulus = 0, tidakLulus = 0;
    double nilai, tertinggi = 0, terendah = 100;

    for ( i = 1; i <= 10; i++) {
      System.out.print("Masukkan Nilai Mahasiswa ke-" + i +": ");
      nilai = scanner.nextDouble();
      if (nilai > tertinggi) {
        tertinggi = nilai;
      }
      if (nilai < terendah) {
        terendah = nilai;
      }
      if (nilai >= 60){
        lulus++;
      } else {
        tidakLulus++;
      }
    }
    System.out.println("Nilai Tertinggi: " + tertinggi);
    System.out.println("Nilai Terendah: " + terendah);
    System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
    System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);
    scanner.close();
  }
}