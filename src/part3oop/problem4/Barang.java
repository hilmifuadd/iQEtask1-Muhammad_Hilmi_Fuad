package problem4;

public class Barang {
    float p,l,t,kg,hitungOngkir,volume;

    public Barang(float p, float l, float t, float kg){
        this.p = p;
        this.l = l;
        this.t = t;
        this.kg=kg;
    }
    public float volume(){
        volume = this.p * this.l * this.t;
        return volume;
    }
}
