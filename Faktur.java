
public class Faktur implements KalkulatorPembayaran { // Inheritance
    private String kodeBarang;
    private String namaPelanggan;
    private Barang barang;
    private int jumlahBarang;

    public Faktur(String kodeBarang, String namaPelanggan, Barang barang, int jumlahBarang) {
        this.kodeBarang = kodeBarang;
        this.namaPelanggan = namaPelanggan;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNomorFaktur() {
        return kodeBarang;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    @Override
    public double totalBayar(double harga, int jumlah) {
        return harga * jumlah;
    }
}
