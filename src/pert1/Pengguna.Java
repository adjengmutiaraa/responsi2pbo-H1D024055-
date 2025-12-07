package pert1;

class Pengguna {
    private int Umur;
    private double beratBadan;
    private double tinggiBadan;
    public static final double faktorAktivitas = 1.2;

    public Pengguna(int umur, double beratBadan, double tinggiBadan) {
        this.Umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double BMI = hitungBMI();
        if (BMI < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (BMI < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return beratBadan * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + Umur + " tahun");
        System.out.println("Berat: " + beratBadan + " kg");
        System.out.println("Tinggi: " + tinggiBadan + " cm");
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " + hitungKalori());
        System.out.println("====================================");
    }
}