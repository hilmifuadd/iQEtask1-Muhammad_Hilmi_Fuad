package problem2;

public class Kubus extends BangunRuang{
    int r;
    int luas;
    public Kubus(int r){
        this.r =r;
    }
    public float volume(){
        return this.r * this.r * this.r;
    }
}
