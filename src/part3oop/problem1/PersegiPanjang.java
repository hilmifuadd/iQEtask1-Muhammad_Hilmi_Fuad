package part3oop.problem1;

public class PersegiPanjang extends BangunDatar {
    int panjang;
    int lebar;
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public float luas(){
        return this.panjang * this.lebar;
    }
    public float keliling(){
        return (this.panjang+this.lebar)*2;
    }
}
