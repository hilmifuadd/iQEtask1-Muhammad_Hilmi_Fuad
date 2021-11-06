package problem3;

public class Tambah extends Kalkulator {
    double x;
    double y;

    public Tambah(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x + this.y;
    }
}
