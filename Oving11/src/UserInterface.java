import java.util.Scanner;
import java.util.List;

public class UserInterface {
    private PropertyRegistry registry;
    private Scanner scanner;

    public UserInterface(PropertyRegistry registry) {
        this.registry = registry;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nVelkommen til Eiendomsregisteret!");
            System.out.println("1. Registrer en ny eiendom");
            System.out.println("2. Vis alle eiendommer");
            System.out.println("3. Søk etter eiendom med kommunenummer, gårdsnummer og bruksnummer");
            System.out.println("4. Beregn gjennomsnittsareal for alle eiendommer");
            System.out.println("5. Søk etter alle eiendommer med et spesifikt gårdsnummer");
            System.out.println("6. Avslutt");

            System.out.print("Velg et alternativ (1-6): ");
            int valg = scanner.nextInt();
            scanner.nextLine(); // Tømmer bufferet etter å ha lest int

            switch (valg) {
                case 1:
                    registrerEiendom();
                    break;
                case 2:
                    visAlleEiendommer();
                    break;
                case 3:
                    sokEtterEiendom();
                    break;
                case 4:
                    beregnGjennomsnittsAreal();
                    break;
                case 5:
                    sokEiendommerMedGardsnummer();
                    break;
                case 6:
                    System.out.println("Avslutter programmet...");
                    return;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }

    private void registrerEiendom() {
        System.out.println("Registrer en ny eiendom:");

        System.out.print("Kommunenummer: ");
        int kommunenummer = scanner.nextInt();
        scanner.nextLine(); // Tømmer bufferet

        System.out.print("Kommunenavn: ");
        String kommunenavn = scanner.nextLine();

        System.out.print("Gårdsnummer (gnr): ");
        int gaardsnummer = scanner.nextInt();

        System.out.print("Bruksnummer (bnr): ");
        int bruksnummer = scanner.nextInt();
        scanner.nextLine(); // Tømmer bufferet

        System.out.print("Bruksnavn (kan være tom): ");
        String bruksnavn = scanner.nextLine();

        System.out.print("Areal i m2: ");
        double areal = scanner.nextDouble();
        scanner.nextLine(); // Tømmer bufferet

        System.out.print("Eiers navn: ");
        String eierNavn = scanner.nextLine();

        Property nyEiendom = new Property(kommunenummer, kommunenavn, gaardsnummer, bruksnummer, bruksnavn, areal, eierNavn);
        registry.leggTilEiendom(nyEiendom);
        System.out.println("Eiendom registrert.");
    }
    

    private void visAlleEiendommer() {
        registry.skrivUtAlleEiendommer();
    }

    private void sokEtterEiendom() {
        System.out.println("Søk etter eiendom:");

        System.out.print("Kommunenummer: ");
        int kommunenummer = scanner.nextInt();

        System.out.print("Gårdsnummer (gnr): ");
        int gaardsnummer = scanner.nextInt();

        System.out.print("Bruksnummer (bnr): ");
        int bruksnummer = scanner.nextInt();

        List<Property> funnetEiendommer = registry.sokEiendom(kommunenummer, gaardsnummer, bruksnummer);
        registry.skrivUtSokResultater(funnetEiendommer);
    }

    private void beregnGjennomsnittsAreal() {
        double gjennomsnittsAreal = registry.gjennomsnittsAreal();
        System.out.println("Gjennomsnittsareal for alle eiendommer: " + gjennomsnittsAreal + " m2");
    }

    private void sokEiendommerMedGardsnummer() {
        System.out.print("Angi gårdsnummer for søk: ");
        int gnr = scanner.nextInt();
        List<Property> eiendommerMedGnr = registry.finnEiendommerMedGardsnummer(gnr);
        if (eiendommerMedGnr.isEmpty()) {
            System.out.println("Ingen eiendommer funnet med gårdsnummer " + gnr);
        } else {
            eiendommerMedGnr.forEach(eiendom -> System.out.println(eiendom.toString()));
        }
    }
}
