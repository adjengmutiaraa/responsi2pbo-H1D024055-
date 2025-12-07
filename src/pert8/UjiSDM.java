package pert8;

public class UjiSDM {
    public static void main(String[] args) {
        // Header
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        // ==========================================================
        // DATA UJI COBA
        // ==========================================================
        
        // 1. BUAT OBJEK ProgrammerMagang
        // Gunakan constructor dengan data: "Andi", 50000.0, "1234".
        ProgrammerMagang magang1 = new ProgrammerMagang("Andi", 50000.0, "1234");
        
        // 2. PENGUJIAN METODE BERURUTAN
        
        // Panggil method hitungGaji(160).
        magang1.hitungGaji(160);
        // Cetak hasil dari method getStatusCuti().
        System.out.println("Status Cuti: " + magang1
                .getStatusCuti());
        // Panggil login("9999") (Tes PIN salah).
        magang1.login("9999");
        // Panggil login("1234") (Tes PIN benar).
        magang1.login("1234");
        // Cetak hasil dari method getRoleAkses().
        System.out.println("Role Akses: " + magang1.getRoleAkses());
        // Panggil perpanjangKontrak(6).
        magang1.perpanjangKontrak(6);
        // Panggil logout().
        magang1.logout();
    }
}