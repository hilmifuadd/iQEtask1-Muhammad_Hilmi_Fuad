package problem4;

public class main {
    public static void main(String[] args) {
        ongkirBarang ob = new ongkirBarang(5,2,4,1);
        ob.volume();
        ob.hitungOngkir();
        //Cetak
        System.out.println("Harga Ongkir : Rp." + ob.hitungOngkir());
    }
}
