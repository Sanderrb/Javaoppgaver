public class Main{
    public static void main(String[] args) {
        Tekstbehandling behandling = new Tekstbehandling("Dette er en testtekst. Prø disse ordene orgså, æ, ø og å.");
        System.out.println("Antall ord: " + behandling.antallOrd());
        System.out.println("Gjennomsnittlig ordlengde: " + behandling.gjennomsnittligOrdlengde());
        System.out.println("Gjennomsnittlig antall ord per periode: " + behandling.gjennomsnittligOrdPerPeriode());
        behandling.skiftOrd("Prø", "Prøv");
        System.out.println("Endret tekst: " + behandling.hentTekst());
        System.out.println("Tekst med store bokstaver: " + behandling.hentTekstMedStoreBokstaver());
    }
}
