package problem2;

public class Balok extends BangunRuang {
    int p; int l; int t;
    public Balok(int p, int l, int t){
        this.p=p;
        this.l=l;
        this.t=t;
    }
    public float volume() {
        return this.p * this.l * this.t;
    }
}
