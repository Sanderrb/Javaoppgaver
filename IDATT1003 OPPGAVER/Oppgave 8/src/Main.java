import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sander", "Berge", 2003);
        ArbTaker arbTaker = new ArbTaker(person, 1234, 2018, 50000, 25);

        System.out.println(arbTaker);

        Scanner scanner = new Scanner(System.in);
        boolean fortsett = true;

        while (fortsett) {
            System.out.println("1. Endre månedslønn");
            System.out.println("2. Endre skatteprosent");
            System.out.println("3. Vis alle data");
            System.out.println("4. Avslutt");
            System.out.print("Velg et alternativ: ");
            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.print("Ny månedslønn: ");
                    double nyLonn = scanner.nextDouble();
                    arbTaker.setManedslonn(nyLonn);
                    break;
                case 2:
                    System.out.print("Ny skatteprosent: ");
                    double nySkatt = scanner.nextDouble();
                    arbTaker.setSkatteprosent(nySkatt);
                    break;
                case 3:
                    System.out.println(arbTaker);
                    System.out.println("Skattetrekk per måned: " + arbTaker.skattetrekkPerManed() + " kr");
                    System.out.println("Bruttolønn per år: " + arbTaker.bruttolonnPerAr() + " kr");
                    System.out.println("Skattetrekk per år: " + arbTaker.skattetrekkPerAr() + " kr");
                    System.out.println("Navn: " + arbTaker.navn());
                    System.out.println("Alder: " + arbTaker.alder() + " år");
                    System.out.println("Antall år ansatt: " + arbTaker.antallArAnsatt() + " år");
                    break;
                case 4:
                    fortsett = false;
                    break;
                default:
                    System.out.println("Ugyldig valg.");
            }
        }

        scanner.close();
    }
}