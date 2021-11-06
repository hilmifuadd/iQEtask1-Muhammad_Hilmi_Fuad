package problem2;

public class Tabung extends BangunRuang {
    int r; int t;
    public Tabung(int r, int t){
        this.r =r;
        this.t=t;
    }
    public float volume(){
        return (float) (3.14 * this.r * this.r *this.t);
    }
}
