import java.util.Scanner;
public class MenghitungPembayaranParkir {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int jenis, durasi, total = 0;

    do {
      System.out.print("Masukkan Jenis Kendaraan (1.Mobil, 2.Motor, 0.Keluar): ");
      jenis = scanner.nextInt();

      if (jenis == 1 || jenis == 2) {
        System.out.print("Masukkan Lama Durasi): ");
        durasi = scanner.nextInt();
        if (jenis == 1) {
          total+= durasi * 3000;
        } else {
          total+= durasi * 2000;
        }
      }
    } while (jenis != 0);
    System.out.println("Total Tarif Parkir: " + total);

    scanner.close();
  }
}
