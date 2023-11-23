
public class Main{
    public static void main(String[] args) {
        try {
            Brok brok1 = new Brok(3, 4);
            Brok brok2 = new Brok(1, 2);
            Brok brok3 = new Brok(5);

            System.out.print("Brok 1: ");
            brok1.printBrok();

            System.out.print("Brok 2: ");
            brok2.printBrok();

            brok1.summer(brok2);
            System.out.print("Sum: ");
            brok1.printBrok();

            brok1.subtraher(brok2);
            System.out.print("Differanse: ");
            brok1.printBrok();

            brok1.multipliser(brok2);
            System.out.print("Produkt: ");
            brok1.printBrok();

            brok1.divider(brok2);
            System.out.print("Kvotient: ");
            brok1.printBrok();

            brok3.printBrok();
        } catch (IllegalArgumentException e) {
            System.out.println("Feil: " + e.getMessage());
        }
    }
}
