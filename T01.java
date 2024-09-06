// 12S24006 - Margareth Bungaran Sitompul
// 12S24012 - Choqy Pananda Sirait
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahun, terbit;

        tahun = input.nextInt();
        String penerbit;

        penerbit = input.nextLine();
        String format, buku, elektranik;

        format = input.nextLine();
        double harga, pembelian;

        harga = input.nextDouble();
        double minimum, margin;

        margin = input.nextDouble();
        int stok;

        stok = input.nextInt();
        double rating;

        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
