class Produk {
    private String namaProduk;
    private int hargaSatuan;
    private int jumlahBeli;

public Produk (String namaProduk, int hargaSatuan){
    this.namaProduk = namaProduk;
    this.hargaSatuan = hargaSatuan;
}

public void setJumlahBeli(int jumlahBeli){
    if(jumlahBeli > 0){
        this.jumlahBeli = jumlahBeli;
    }else{
        System.out.println(" peringatan: Jumlah beli tidak bolej 0 atau minus!");
    }
}

public String getNamaProduk(){
    return this.namaProduk;
}
public int hitungTotal(){
    return this.hargaSatuan * this.jumlahBeli;
}
}


public class MainEncapsulation{
    public static void main(String[] args) {
        Produk item = new Produk("Potato Chips", 15000);
        item.setJumlahBeli(3);

        System.out.println("--- STRUK PEMBELIAN ---");
        System.out.println("Nama Produk : "+item.getNamaProduk());
        System.out.println("Total Bayar : Rp"+item.hitungTotal());
        System.out.println("-----------------------");
    }
}