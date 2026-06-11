// package LEC;

class Barang{
    String nama;
    int harga;

    public void cetakNota(){
        System.out.println("Barang: "+ nama+ " | Harga: Rp" +harga);
    }
}
class Makanan extends Barang{
    String tglKedaluwarsa;
    public void infoMakanan(){
        System.out.println("Status aman dikkonsumsi sebelum "+ tglKedaluwarsa);
    }
}

class Pakaian extends Barang{
    String ukuran;
    public void infoPakaian(){
        System.out.println("Ukuran: size "+ ukuran);
    }
}

public class Inharitance {

    public static void main(String[] args) {
        Makanan snack = new Makanan();
        snack.nama = "Potato Chips";
        snack.harga = 15000;
        snack.tglKedaluwarsa = "25 - 09 - 2026";

        Pakaian baju = new Pakaian();
        baju.nama = "Kemeja Batik";
        baju.harga = 120000;
        baju.ukuran = "XL";

        System.out.println("--- NOTA BELANJA TOKO ---");
        snack.cetakNota();
        snack.infoMakanan();

        System.out.println("-------------------------");
        baju.cetakNota();
        baju.infoPakaian();


    }
}