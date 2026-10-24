import java.util.Scanner;
public class PenjualanTiketBioskop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hargaTiket = 50000, jumlahTiket = 0, hargaDasar = 0, tiketTerjual = 0;
    double diskon = 0, jumlahDiskon = 0, totalHarga = 0, totalPendapatanHarian = 0;

    while (true) {
      System.out.print("Membeli Berapa Tiket (0.Berhenti) : ");
      jumlahTiket = scanner.nextInt();

      if (jumlahTiket < 0) {
        System.out.println("jumlah tiket tidak valid (negatif)");
        continue;
      }

      if (jumlahTiket == 0) {
        System.out.println("Transaksi Diselesaikan");
        break;
      }

      hargaDasar = jumlahTiket * hargaTiket;

      diskon = 0;

      if (jumlahTiket > 10) {
        diskon = 0.15;
      } else if (jumlahTiket > 4) {
        diskon = 0.1;
      }
      jumlahDiskon = hargaDasar * diskon;
      totalHarga = hargaDasar - jumlahDiskon;

      tiketTerjual = tiketTerjual + jumlahTiket;
      totalPendapatanHarian = totalPendapatanHarian + totalHarga;
    }

    System.out.println("Jumlah Tiket Terjual: " + tiketTerjual);
    System.out.println("Jumlah Pendapatan Harian: " + totalPendapatanHarian);

    scanner.close();

  }

}

// Seorang pengelola bioskop ingin membuat program untuk menghitung total
// penjualan
// tiket dalam satu hari. Tiket dijual dengan harga Rp 50.000 per tiket. Program
// harus
// menghitung total tiket yang terjual dan total harga penjualan tiket selama
// satu hari
// dengan ketentuan sebagai berikut:
// • Jika pelanggan membeli lebih dari 4 tiket, pelanggan mendapatkan diskon
// 10%.
// • Jika pelanggan membeli lebih dari 10 tiket, pelanggan mendapatkan diskon
// 15%.
// • Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan
// input
// tersebut dan meminta input ulang.
// Catatan: Perulangan dapat menggunakan for, while, atau do-while. Penambahan
// break
// atau continue jika diperlukan
