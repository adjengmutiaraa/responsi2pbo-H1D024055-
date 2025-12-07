package pert3;
// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    private double tunjangan;

    // Constructor
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Nama: " + this.nama + " | Gaji Pokok: " +  this.gajiPokok
            + " | Tunjangan: Rp " + this.tunjangan);
        System.out.println("Total Gaji: " + totalGaji);
    }
}