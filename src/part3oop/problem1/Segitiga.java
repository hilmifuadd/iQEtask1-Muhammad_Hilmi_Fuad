package part3oop.problem1;

public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    public Segitiga(int tinggi, int alas){
        this.alas =alas;
        this.tinggi= tinggi;
    }
    public float luas(){
        return this.alas * this.tinggi/2;
    }
    public float keliling(){
        return this.alas*3;
    }
}
