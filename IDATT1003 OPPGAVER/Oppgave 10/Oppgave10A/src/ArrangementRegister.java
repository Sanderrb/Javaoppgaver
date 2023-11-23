import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ArrangementRegister {
    private final List<Arrangement> arrangementer = new ArrayList<>();

    public void registrerArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public List<Arrangement> finnArrangementerPåSted(String sted) {
        List<Arrangement> funnet = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getSted().equalsIgnoreCase(sted)) {
                funnet.add(arr);
            }
        }
        return funnet;
    }

    public List<Arrangement> finnArrangementerPåDato(long dato) {
        List<Arrangement> funnet = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if ((arr.getTidspunkt() / 10000) == dato) { // Deler på 10000 for å ignorere tidspunktet på dagen
                funnet.add(arr);
            }
        }
        return funnet;
    }

    public List<Arrangement> finnArrangementerITidsintervall(long fraDato, long tilDato) {
        List<Arrangement> funnet = new ArrayList<>();
        for (Arrangement arr : arrangementer) {
            if (arr.getTidspunkt() >= fraDato && arr.getTidspunkt() <= tilDato) {
                funnet.add(arr);
            }
        }
        funnet.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return funnet;
    }

    public List<Arrangement> sorterEtterSted() {
        List<Arrangement> sortert = new ArrayList<>(arrangementer);
        sortert.sort(Comparator.comparing(Arrangement::getSted));
        return sortert;
    }

    public List<Arrangement> sorterEtterType() {
        List<Arrangement> sortert = new ArrayList<>(arrangementer);
        sortert.sort(Comparator.comparing(Arrangement::getType));
        return sortert;
    }

    public List<Arrangement> sorterEtterTidspunkt() {
        List<Arrangement> sortert = new ArrayList<>(arrangementer);
        sortert.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return sortert;
    }
}