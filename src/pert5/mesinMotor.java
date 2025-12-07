package pert5;

class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    protected String tipeMotor;

    // Constructor
    public mesinMotor(String namaMesin, int tenagaHP, String tipeMotor) {
        super(namaMesin, tenagaHP);
        this.tipeMotor = tipeMotor;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Motor " + this.namaMesin +
                " | Tipe: " + this.tipeMotor +
                " | Tenaga:  " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}