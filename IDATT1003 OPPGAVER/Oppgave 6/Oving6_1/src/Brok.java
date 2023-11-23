public class Brok {
    private int teller;
    private int nevner;

    public Brok(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være 0.");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok(int teller) {
        this(teller, 1);
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void summer(Brok annenBrok) {
        this.teller = this.teller * annenBrok.getNevner() + annenBrok.getTeller() * this.nevner;
        this.nevner *= annenBrok.getNevner();
    }

    public void subtraher(Brok annenBrok) {
        this.teller = this.teller * annenBrok.getNevner() - annenBrok.getTeller() * this.nevner;
        this.nevner *= annenBrok.getNevner();
    }

    public void multipliser(Brok annenBrok) {
        this.teller *= annenBrok.getTeller();
        this.nevner *= annenBrok.getNevner();
    }

    public void divider(Brok annenBrok) {
        if (annenBrok.getTeller() == 0) {
            throw new IllegalArgumentException("Kan ikke dele på 0.");
        }
        this.teller *= annenBrok.getNevner();
        this.nevner *= annenBrok.getTeller();
    }

    public void printBrok() {
        System.out.println(teller + "/" + nevner);
    }

    @Override
    public String toString() {
        return teller + "/" + nevner;
    }
}