import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

class Rett {
    private String navn;
    private String type; // forrett, hovedrett, dessert osv
    private double pris;
    private String oppskrift;

    public Rett(String navn, String type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }
}

class Meny {
    private List<Rett> retter;

    public Meny() {
        retter = new ArrayList<>();
    }

    public void leggTilRett(Rett rett) {
        retter.add(rett);
    }

    public List<Rett> getRetter() {
        return retter;
    }

    public double getTotalPris() {
        return retter.stream().mapToDouble(Rett::getPris).sum();
    }
}

class MenyRegister {
    private List<Rett> alleRetter = new ArrayList<>();
    private List<Meny> alleMenyer = new ArrayList<>();

    public void registrerRett(Rett nyRett) {
        alleRetter.add(nyRett);
    }

    public Rett finnRett(String navn) {
        for (Rett rett : alleRetter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                return rett;
            }
        }
        return null;
    }

    public List<Rett> finnRetterAvType(String type) {
        return alleRetter.stream()
                .filter(rett -> rett.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public void registrerMeny(Meny nyMeny) {
        alleMenyer.add(nyMeny);
    }

    public List<Meny> finnMenyerMedTotalprisInnenforIntervall(double minPris, double maksPris) {
        return alleMenyer.stream()
                .filter(meny -> meny.getTotalPris() >= minPris && meny.getTotalPris() <= maksPris)
                .collect(Collectors.toList());
    }
}

public class RestaurantKlient {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MenyRegister register = new MenyRegister();

    public static void main(String[] args) {
        boolean kjører = true;
        while (kjører) {
            visMeny();
            int valg = scanner.nextInt();
            scanner.nextLine(); 

            switch (valg) {
                case 1:
                    registrerRett();
                    break;
                case 2:
                    finnRett();
                    break;
                case 3:
                    finnRetterAvType();
                    break;
                case 4:
                    registrerMeny();
                    break;
                case 5:
                    finnMenyerMedTotalprisInnenforIntervall();
                    break;
                case 0:
                    kjører = false;
                    System.out.println("Avslutter programmet.");
                    break;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    break;
            }
        }
    }

    private static void visMeny() {
        System.out.println("\nVelg en operasjon:");
        System.out.println("1 - Registrer en ny rett");
        System.out.println("2 - Finn en rett gitt navnet");
        System.out.println("3 - Finn alle retter av en gitt type");
        System.out.println("4 - Registrer en ny meny");
        System.out.println("5 - Finn alle menyer med totalpris innenfor et gitt intervall");
        System.out.println("0 - Avslutt");
        System.out.print("Ditt valg: ");
    }

    private static void registrerRett() {
        System.out.print("Angi navn på retten: ");
        String navn = scanner.nextLine();
        System.out.print("Angi type (forrett, hovedrett, dessert etc.): ");
        String type = scanner.nextLine();
        System.out.print("Angi pris: ");
        double pris = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        System.out.print("Angi oppskrift: ");
        String oppskrift = scanner.nextLine();

        Rett nyRett = new Rett(navn, type, pris, oppskrift);
        register.registrerRett(nyRett);
        System.out.println("Rett registrert!");
    }

    private static void finnRett() {
        System.out.print("Angi navn på retten du vil finne: ");
        String navn = scanner.nextLine();
        Rett rett = register.finnRett(navn);
        if (rett != null) {
            System.out.println("Funnet rett: " + rett.getNavn() + ", Type: " + rett.getType() + ", Pris: " + rett.getPris());
        } else {
            System.out.println("Ingen rett funnet med det navnet.");
        }
    }

    private static void finnRetterAvType() {
        System.out.print("Angi type for å finne retter: ");
        String type = scanner.nextLine();
        List<Rett> retter = register.finnRetterAvType(type);
        System.out.println("Retter av type '" + type + "':");
        for (Rett rett : retter) {
            System.out.println(rett.getNavn() + " - " + rett.getPris() + " kr");
        }
    }

    private static void registrerMeny() {
        Meny nyMeny = new Meny();
        System.out.println("Legg til retter i menyen (skriv 'ferdig' for å fullføre):");
        String rettNavn;
        do {
            System.out.print("Rettens navn: ");
            rettNavn = scanner.nextLine();
            if (!rettNavn.equalsIgnoreCase("ferdig")) {
                Rett rett = register.finnRett(rettNavn);
                if (rett != null) {
                    nyMeny.leggTilRett(rett);
                } else {
                    System.out.println("Rett ikke funnet.");
                }
            }
        } while (!rettNavn.equalsIgnoreCase("ferdig"));
        register.registrerMeny(nyMeny);
        System.out.println("Meny registrert med " + nyMeny.getRetter().size() + " retter.");
    }

    private static void finnMenyerMedTotalprisInnenforIntervall() {
        System.out.print("Angi minimum pris: ");
        double minPris = scanner.nextDouble();
        System.out.print("Angi maksimum pris: ");
        double maksPris = scanner.nextDouble();
        List<Meny> menyer = register.finnMenyerMedTotalprisInnenforIntervall(minPris, maksPris);
        System.out.println("Menyer med totalpris mellom " + minPris + " og " + maksPris + ":");
        for (Meny meny : menyer) {
            System.out.println("Menypris: " + meny.getTotalPris());
        }
    }
}