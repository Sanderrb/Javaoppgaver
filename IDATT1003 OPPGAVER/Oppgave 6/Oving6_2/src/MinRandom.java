import java.util.Random;

public class MinRandom {
    private Random random;

    public MinRandom() {

        this.random = new Random();
    }

    public int nesteHeltall(int nedre, int ovre) {

        return random.nextInt(nedre, ovre);
    }

    public double nesteDesimaltall(double nedre, double ovre) {

        return random.nextDouble(nedre, ovre);
    }
}