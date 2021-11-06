package problem3;

public class main {
    public static void main(String[] args) {
        Kalkulator kalku = new Kalkulator();
        Tambah plus = new Tambah(3,4);
        Kurang min = new Kurang(15,4);
        Kali mpy = new Kali(10,10);
        Bagi div = new Bagi(12,3);
        kalku.hitung();

        System.out.println("Penjumlahan :"+ plus.hitung());
        System.out.println("Pengurangan :"+ min.hitung());
        System.out.println("Perkalian :"+ mpy.hitung());
        System.out.println("Pembagian :"+ div.hitung());
    }
}
