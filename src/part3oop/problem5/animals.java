package problem5;

public class animals {
    String nama = "Binatang";
    String makanan;
    String gigi;

    public animals(){
    }
    public animals(String nama, String makanan, String gigi){
        this.nama = nama;
        this.makanan = makanan;
        this.gigi = gigi;
    }

    public animals(String nama) {
        this.nama = nama;
    }

    public void  identifyMyself(){
        System.out.println("Hi, I'm Parent of All animal. My name is "+this.nama);
    }

}
