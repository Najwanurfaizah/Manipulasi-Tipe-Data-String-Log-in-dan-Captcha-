import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupermarketProgram {
    private Date tanggal;
    private String waktu;
    
    private String namaPelanggan;
    private String nomorHP;
    private String alamat;
    
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBarang;
    
    private double totalBayar;
    private String kasir;

    // Constructor
    public SupermarketProgram(String namaSuperMarket) {
        this.tanggal = new Date();
        this.waktu = getCurrentTime();
    }

    // Method untuk menampilkan semua data
    public void tampilkanSemuaData() {
        System.out.println("===NAJWA'S MART===");
        System.out.println("Tanggal: " + new SimpleDateFormat("EEEE, dd/MM/yyyy").format(tanggal));
        System.out.println("Waktu: " + waktu);
        System.out.println("========================");
        System.out.println("      PELANGGAN   ");
        System.out.println("---------------------");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("No. HP         : " + nomorHP);
        System.out.println("Alamat         : " + alamat);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("        BARANG    ");
        System.out.println("------------------------------");
        System.out.println("Kode Barang    : " + kodeBarang);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Barang   : " + hargaBarang);
        System.out.println("Jumlah Barang  : " + jumlahBarang);
        System.out.println("TOTAL BAYAR    : " + totalBayar);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir          : " + kasir);
    }

    // Method untuk mendapatkan waktu saat ini
    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss z");
        return sdf.format(new Date());
    }

    // Metode-metode setter untuk mengatur nilai dari field
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    public void setJumlahBeli(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
        this.totalBayar = hargaBarang * jumlahBarang;
    }
    public void setKasir(String kasir) {
        this.kasir = kasir;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Supermarket : ");
            String namaSupermarket = scanner.nextLine();

            SupermarketProgram program = new SupermarketProgram(namaSupermarket);

            System.out.print("Masukkan Nama Pelanggan   : ");
            program.setNamaPelanggan(scanner.nextLine());

            System.out.print("Masukkan No. HP Pelanggan : ");
            program.setNomorHP(scanner.nextLine());

            System.out.print("Masukkan Alamat Pelanggan : ");
            program.setAlamat(scanner.nextLine());

            System.out.print("Masukkan Kode Barang      : ");
            program.setKodeBarang(scanner.nextLine());

            System.out.print("Masukkan Nama Barang      : ");
            program.setNamaBarang(scanner.nextLine());

            System.out.print("Masukkan Harga Barang     : ");
            program.setHargaBarang(scanner.nextDouble());

            System.out.print("Masukkan Jumlah Beli      : ");
            program.setJumlahBeli(scanner.nextInt());

            scanner.nextLine(); // Membuang karakter newline

            System.out.print("Masukkan Nama Kasir       : ");
            program.setKasir(scanner.nextLine());

            // Menampilkan semua data
            program.tampilkanSemuaData();
        }
    }
    
}