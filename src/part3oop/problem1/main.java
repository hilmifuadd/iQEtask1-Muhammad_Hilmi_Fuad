package part3oop.problem1;
public class main {
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        // Memasukkan input sisi persegi
        Persegi p= new Persegi(4);
        // Memasukkan input alas dan tinggi segitiga
        Segitiga s = new Segitiga(3,4);
        // Memasukkan input panjang dan lebar persegi panjang
        PersegiPanjang Pp = new PersegiPanjang(7,8);
        bangundatar.luas();
        bangundatar.keliling();

        System.out.println("Luas Persegi :"+ p.luas());
        System.out.println("Keliling Persegi :"+ p.keliling());
        System.out.println("Luas segitiga :"+ s.luas());
        System.out.println("Keliling Segitiga :"+ s.keliling());
        System.out.println("Luas Persegi Panjang :"+ Pp.luas());
        System.out.println("Keliling Persegi Panjang :"+ Pp.keliling());
    }
}
