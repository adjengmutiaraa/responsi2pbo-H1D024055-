package pert7;

public class PaymentTest {

    public static void main(String[] args) {
        // Header
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        EWalletPayment payment1 = new EWalletPayment("OVO", 150000, 50000);

        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        System.out.println("Saldo awal: Rp. " + payment1.getBalance());
        System.out.println("Biaya transaksi: Rp. " + payment1.getTransactionFee());
        // 2. Memproses pembayaran
        System.out.println("\nMemproses pembayaran sebesar Rp. " + payment1.getBalance());
        String result1 = payment1.processPayment();
        System.out.println(result1);
        // 3. Menampilkan data setelah transaksi
        System.out.println("Sisa saldo: Rp. " + payment1.getBalance());
        System.out.println("Detail Transaksi: " + payment1.getPaymentDetails());
    }
}
