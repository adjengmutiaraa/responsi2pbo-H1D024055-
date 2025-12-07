package pert2;

class BarangMusik {
    private String kode;
    private String nama;
    private double hargaSatuan;
    private int jumlahStok;

    // Constructor 1
    public BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSatuan = 0;
        this.jumlahStok = 0;
    }

    // Constructor 2
    public BarangMusik(String kode, String nama, double hargaSatuan) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = 0;
    }

    // Constructor 3
    public BarangMusik(String kode, String nama, double hargaSatuan, int jumlahStok) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = jumlahStok;
    }

    void ubahHarga(double hargaBaru) {
        this.hargaSatuan = hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        this.jumlahStok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + nama + " | Kode: " + kode +
                " | Harga: Rp " + hargaSatuan + " | Stok: " + jumlahStok + " unit");
    }
}