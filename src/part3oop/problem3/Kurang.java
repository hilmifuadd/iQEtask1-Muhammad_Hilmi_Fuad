package problem3;
public class Kurang extends Kalkulator {
    double x;
    double y;

    public Kurang(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x - this.y;
    }
}
