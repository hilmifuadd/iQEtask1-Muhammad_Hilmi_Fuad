package problem3;

public class Bagi extends Kalkulator{
    double x;
    double y;

    public Bagi(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x / this.y;
    }
}
