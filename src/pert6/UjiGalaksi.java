package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur PesawatTempur = new PesawatTempur("Astra-Fury", 2, 8);

        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi KapalEksplorasi = new KapalEksplorasi("Voyager X", 10, 4);

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        System.out.println();
        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================
        System.out.println("--- PESAWAT TEMPUR ---");
        // TODO:
        // Aktifkan mesin pesawat
        PesawatTempur.aktifkanMesin();
        // Pesawat menjelajah 10 km
        PesawatTempur.jelajah(10);
	    // Pesawat menjelajah 30 km
        PesawatTempur.jelajah(30);
        // Pesawat menembak 3 rudal
        PesawatTempur.tembakRudal(3);
        // Tampilkan status pesawat
        PesawatTempur.tampilStatus();

        System.out.println();
        System.out.println("--- KAPAL EKSPLORASI ---");

        // TODO:
        // Aktifkan mesin kapal eksplorasi
        KapalEksplorasi.aktifkanMesin();
        // Kapal menjelajah 15 km
        KapalEksplorasi.jelajah(15);
        // Kapal melakukan scanPlanet("Kepler-442b")
        KapalEksplorasi.scanPlanet("Kepler-442b");
        // Tampilkan status kapal
        KapalEksplorasi.tampilStatus();
    }
}
