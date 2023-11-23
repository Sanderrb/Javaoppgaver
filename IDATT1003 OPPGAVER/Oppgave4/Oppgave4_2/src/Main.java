import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller();
        int rundeNummer = 1;

        while (true) {
            System.out.println("Runde " + rundeNummer + ":");
            spillerA.kastTerningen();
            spillerB.kastTerningen();

            System.out.println("Spiller A: Poeng " + spillerA.getSumPoeng());
            System.out.println("Spiller B: Poeng " + spillerB.getSumPoeng());

            if (spillerA.erFerdig()) {
                System.out.println("Spiller A har vunnet!");
                break;
            } else if (spillerB.erFerdig()) {
                System.out.println("Spiller B har vunnet!");
                break;
            }

            rundeNummer++;
        }
    }
}
