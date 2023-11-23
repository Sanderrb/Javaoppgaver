
import java.util.List;
import java.util.Scanner;



public class OppgaveA {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrangementRegister register = new ArrangementRegister();

    public static void main(String[] args) {
        boolean kjører = true;
        while (kjører) {
            System.out.println("\nVelkommen til arrangementsregisteret!");
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på et gitt sted");
            System.out.println("3. Finn arrangementer på en gitt dato");
            System.out.println("4. Finn arrangementer innenfor et tidsintervall");
            System.out.println("5. Vis alle arrangementer sortert etter sted");
            System.out.println("6. Vis alle arrangementer sortert etter type");
            System.out.println("7. Vis alle arrangementer sortert etter tidspunkt");
            System.out.println("8. Avslutt");

            System.out.print("Velg et alternativ: ");
            int valg = scanner.nextInt();
            scanner.nextLine(); // Renner ut linjeskiftet etter int-innlesning

            switch (valg) {
                case 1:
                    registrerNy();
                    break;
                case 2:
                    finnPaSted();
                    break;
                case 3:
                    finnPaDato();
                    break;
                case 4:
                    finnITidsintervall();
                    break;
                case 5:
                    visSortertListe(register.sorterEtterSted());
                    break;
                case 6:
                    visSortertListe(register.sorterEtterType());
                    break;
                case 7:
                    visSortertListe(register.sorterEtterTidspunkt());
                    break;
                case 8:
                    kjører = false;
                    break;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    break;
            }
        }
    }

    private static void registrerNy() {
        System.out.print("Angi entydig nummer: ");
        int nummer = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Angi navn: ");
        String navn = scanner.nextLine();
        System.out.print("Angi sted: ");
        String sted = scanner.nextLine();
        System.out.print("Angi arrangør: ");
        String arrangør = scanner.nextLine();
        System.out.print("Angi type: ");
        String type = scanner.nextLine();
        System.out.print("Angi tidspunkt (yyyymmddhhmm): ");
        long tidspunkt = scanner.nextLong();

        Arrangement nyttArrangement = new Arrangement(nummer, navn, sted, arrangør, type, tidspunkt);
        register.registrerArrangement(nyttArrangement);
        System.out.println("Arrangement registrert!");
    }

    private static void finnPaSted() {
        System.out.print("Angi sted: ");
        String sted = scanner.nextLine();
        visSortertListe(register.finnArrangementerPåSted(sted));
    }

    private static void finnPaDato() {
        System.out.print("Angi dato (yyyymmdd): ");
        long dato = scanner.nextLong();
        visSortertListe(register.finnArrangementerPåDato(dato));
    }

    private static void finnITidsintervall() {
        System.out.print("Angi startdato (yyyymmddhhmm): ");
        long fraDato = scanner.nextLong();
        System.out.print("Angi sluttdato (yyyymmddhhmm): ");
        long tilDato = scanner.nextLong();
        visSortertListe(register.finnArrangementerITidsintervall(fraDato, tilDato));
    }

    private static void visSortertListe(List<Arrangement> liste) {
        if (liste.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
            return;
        }
        for (Arrangement arr : liste) {
            System.out.println("Nummer: " + arr.getEntydigNummer() + ", Navn: " + arr.getNavn() + ", Sted: " + arr.getSted() +
                    ", Arrangør: " + arr.getArrangør() + ", Type: " + arr.getType() + ", Tidspunkt: " + arr.getTidspunkt());
        }
    }
}
