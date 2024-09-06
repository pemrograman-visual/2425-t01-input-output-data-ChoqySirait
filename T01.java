// 12S24006 - Margareth Bungaran Sitompul
// 12S24012 - Choqy Pananda Sirait
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahun, terbit;

        tahun = Integer.parseInt(input.nextLine());
        String penerbit;

        penerbit = input.nextLine();
        String format, buku, elektranik;

        format = input.nextLine();
        double harga, pembelian;

        harga = Double.parseDouble(input.nextLine());
        double minimum, margin;

        margin = Double.parseDouble(input.nextLine());
        int stok;

        stok = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
