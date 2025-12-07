package pert4;

class Customer {
    // TODO: Buatkan atribut
    protected String namaLengkap;
    protected String noIdentitas;
    protected int totalBelanja;

    // TODO: Sediakan constructor
    public Customer(String namaLengkap, String noIdentitas, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.noIdentitas = noIdentitas;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " + this.namaLengkap +
            " | ID: " + this.noIdentitas +
            " | Total Belanja: " + this.totalBelanja);
    }
}
