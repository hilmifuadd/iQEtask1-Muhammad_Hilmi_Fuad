package problem5;

public class Herbivore extends animals{
    private String makanan = "tumbuhan";
    private String gigi = "tumpul";

    public Herbivore() {
        super();
    }
    public Herbivore(String nama) {
        super(nama);
    }
    public void identifyMyself() {
        System.out.println("Hi, I'm Herbivore. My name is "+this.nama+". My Food is "+this.makanan+", I have "+this.gigi+" teeth.");
    }
}
