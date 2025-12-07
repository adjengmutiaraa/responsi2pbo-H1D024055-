package pert4;

class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    protected int poin;
    protected String level;

    // TODO: Buat constructor dengan super
    public Member(String namaLengkap, String noIdentitas, int totalBelanja, int poin, String level) {
        super(namaLengkap, noIdentitas, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Nama: " + this.namaLengkap +
                " | ID: " + this.noIdentitas +
                " | Total Belanja: " + this.totalBelanja);
        System.out.println("Poin Reward: " + this.poin +" | Level: " + this.level);
    }
}
