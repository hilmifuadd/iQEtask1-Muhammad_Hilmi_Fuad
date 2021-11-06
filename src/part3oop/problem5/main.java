package problem5;

public class main {
    public static void main(String[] args) {
        //Inititate
        animals a = new animals("Binatang");
        a.identifyMyself();
        //Input
        Carnivore carni = new Carnivore("Singa");
        Herbivore herbi = new Herbivore("Kambing");
        Omnivore omni = new Omnivore("Ayam");
        //Cetak Output
        carni.identifyMyself();
        herbi.identifyMyself();
        omni.identifyMyself();
    }
}
