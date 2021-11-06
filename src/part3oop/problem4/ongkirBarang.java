package problem4;

public class ongkirBarang extends Barang{
    public ongkirBarang(float p, float l, float t, float kg) {
        super(p, l, t, kg);
    }
    public float hitungOngkir(){
        float volume = this.volume();
        Double berat =  Math.ceil(this.kg);
        if (volume <= 50 || berat <= 1){
           return 5000.0F;
        } else {
            return 10000.0F;
        }
    }
}
