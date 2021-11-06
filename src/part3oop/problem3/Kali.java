package problem3;
public class Kali extends Kalkulator{
    double x;
    double y;

    public Kali(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double hitung(){
        return this.x * this.y;
    }
}
