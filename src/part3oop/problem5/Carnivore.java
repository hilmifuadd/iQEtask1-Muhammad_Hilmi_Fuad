package problem5;

public class Carnivore extends animals {
    private String makanan="Daging";
    private String gigi ="Tajam";

    public Carnivore(){
        super();
    }
    public Carnivore(String nama){
        super(nama);
    }
    public void identifyMyself(){
        System.out.println("Hi, I'm Carnivore. My name is "+this.nama+". My food is "+this.makanan+", I have "+this.gigi+" teeth.");
    }
}
