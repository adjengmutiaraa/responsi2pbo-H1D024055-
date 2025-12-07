package pert7;

public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String namaLayanan;
    private double balance;
    private double transactionAmount;
    private final double transactionFee = 2000;

    // TODO: Buat constructor untuk mengisi nilai atribut

    public EWalletPayment(String namaLayanan, double balance, double transactionAmount) {
        this.namaLayanan = namaLayanan;
        this.balance = balance;
        this.transactionAmount = transactionAmount;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal
    @Override
    public String processPayment() {
        double totalPayment = transactionAmount + transactionFee;

        if (balance >= totalPayment) {
            balance -= totalPayment;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan +
                " (termasuk fee Rp " + transactionFee + ")";
    }

    @Override
    public double getTransactionFee() {
        return transactionFee;
    }

    @Override
    public double getBalance() {
        return balance;
    }

}
