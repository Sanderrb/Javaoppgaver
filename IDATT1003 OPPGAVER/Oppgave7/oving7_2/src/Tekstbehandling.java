public class Tekstbehandling {
    private String tekst;

    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }

    public int antallOrd() {
        return tekst.split("\\s+").length;
    }

    public double gjennomsnittligOrdlengde() {
        String[] ord = tekst.split("\\s+");
        int totalLengde = 0;
        for (String o : ord) {
            totalLengde += o.length();
        }
        return (double) totalLengde / ord.length;
    }

    public double gjennomsnittligOrdPerPeriode() {
        String[] perioder = tekst.split("[.!?:]");
        int totalOrd = antallOrd();
        return (double) totalOrd / perioder.length;
    }

    public void skiftOrd(String gammeltOrd, String nyttOrd) {
        tekst = tekst.replace(gammeltOrd, nyttOrd);
    }

    public String hentTekst() {
        return tekst;
    }

    public String hentTekstMedStoreBokstaver() {
        return tekst.toUpperCase();
    }
}
