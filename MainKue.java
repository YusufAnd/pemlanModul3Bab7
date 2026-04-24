public class MainKue {
    public static void main(String[] args) {
        
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Kue Lapis", 3000, 1.2);
        kueArray[1] = new KuePesanan("Brownies", 9000, 1.3);
        kueArray[2] = new KuePesanan("Lukchup", 4000, 1.1);
        kueArray[3] = new KuePesanan("Klepon", 1500, 1.2);
        kueArray[4] = new KuePesanan("Bika Ambon", 5500, 1.3);
        kueArray[5] = new KuePesanan("Serabu", 4000, 2.0);
        kueArray[6] = new KuePesanan("Mochi", 3500, 1.2);
        kueArray[7] = new KuePesanan("Lapis Legit", 60000, 3.0);
        kueArray[8] = new KuePesanan("Putu Ayu", 7200, 2.3);
        kueArray[9] = new KuePesanan("Cheese Cake", 40000, 2.1);

        kueArray[10] = new KueJadi("Donat", 2500, 10);
        kueArray[11] = new KueJadi("Bolu Kukus", 2000, 8);
        kueArray[12] = new KueJadi("Nastar", 5000, 8);
        kueArray[13] = new KueJadi("Putri Salju", 5000, 5);
        kueArray[14] = new KueJadi("Kue Sus", 3500, 6);
        kueArray[15] = new KueJadi("Lemper", 2000, 12);
        kueArray[16] = new KueJadi("Onde-Onde", 2500, 11);
        kueArray[17] = new KueJadi("Roti Bakar", 5500, 4);
        kueArray[18] = new KueJadi("Pancong", 3000, 10);
        kueArray[19] = new KueJadi("Pisang Molen", 3700, 7);

        System.out.println("===== DAFTAR KUE =====\n");

        System.out.println("KUE PESANAN: ");
        for (Kue k : kueArray){
            if (k instanceof KuePesanan) {
                System.out.println(k);
            }
        }

        System.out.println("\nKUE JADI: ");
        for (Kue k : kueArray){
            if (k instanceof KueJadi) {
                System.out.println(k);
            }
        }

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue maxKue = kueArray[0];

        for (Kue k : kueArray){
            double hargaKue = k.hitungHarga();
            totalHarga += hargaKue;

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                totalHargaPesanan += hargaKue;
                totalBerat += kp.getBerat();
            }

            if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                totalHargaJadi += hargaKue;
                totalJumlah += kj.getJumlah();
            }

            if (hargaKue > maxKue.hitungHarga()) {
                maxKue = k;
            }
        }

        System.out.println("\n===== Informasi Semua Kue =====");
        System.out.println("Total Harga Semua Kue: Rp " + totalHarga);
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat + " kg");
        System.out.println("Total Harga Kue Jadi: Rp " + totalHargaJadi);
        System.out.println("Total Jumlah Kue jadi: " + totalJumlah + " pcs");

        System.out.println("Kue dengn Harga Termahal: " + maxKue);
    }
    
}
