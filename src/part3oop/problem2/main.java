package problem2;
public class main {
    public static void main(String[] args) {
        BangunRuang bangunruang = new BangunRuang();
        Kubus k = new Kubus(10);
        Balok b = new Balok(3,6,10);
        Tabung tb = new Tabung(7,10);
        bangunruang.volume();
        //Input
        System.out.println("Volume Kubus :"+ k.volume());
        System.out.println("Volume Balok :"+ b.volume());
        System.out.println("Volume Tabung :"+ tb.volume());
    }
}
