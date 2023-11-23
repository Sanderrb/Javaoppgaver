import java.util.Random;

class Spiller {
    public int sumPoeng;
    public Random terning;

    public Spiller() {
        sumPoeng = 0;
        terning = new Random();
    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen() {
        int terningkast = terning.nextInt(6) + 1;
        if (terningkast == 1) {
            sumPoeng = 0;
        } else {
            sumPoeng += terningkast;
        }
    }

    public boolean erFerdig() {
        return sumPoeng >= 100;
    }
}
