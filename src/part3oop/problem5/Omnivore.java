package problem5;

public class Omnivore extends animals{
    String makanan = "semua";
    String gigi = "tajam and tumpul";

    public Omnivore(String nama) {
        super(nama);
    }
    public Omnivore(String nama, String makanan, String gigi) {
        super(nama, makanan, gigi);
        this.makanan =makanan;
        this.gigi=gigi;
    }
    public void identifyMyself() {
        System.out.println("Hi, I'm Omnivore. My name is "+this.nama+". My Food is "+this.makanan+", I have "+this.gigi+" teeth.");
    }
}
