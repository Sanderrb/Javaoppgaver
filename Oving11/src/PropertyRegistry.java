import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyRegistry {
    private List<Property> eiendommer = new ArrayList<>();

    public void leggTilEiendom(Property eiendom) {
        eiendommer.add(eiendom);
    }

    public void leggTilTestdata() {
        leggTilEiendom(new Property(1445, "Gloppen", 77, 631, "Ingen", 1017.6, "Jens Olsen"));
        leggTilEiendom(new Property(1445, "Gloppen", 77, 131, "Synignom", 661.3, "Nicolay Madsen"));
        leggTilEiendom(new Property(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evelyn Jensen"));
        leggTilEiendom(new Property(1445, "Gloppen", 74, 188, "Ingen", 1457.2, "Karl Ove Bråten"));
        leggTilEiendom(new Property(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));
    }
    
    public List<Property> hentAlleEiendommer() {
        return new ArrayList<>(eiendommer);
    }

    public List<Property> sokEiendom(int kommunenummer, int gaardsnummer, int bruksnummer) {
        return eiendommer.stream()
            .filter(p -> p.getKommunenummer() == kommunenummer && p.getGaardsnummer() == gaardsnummer && p.getBruksnummer() == bruksnummer)
            .collect(Collectors.toList());
    }

    public double gjennomsnittsAreal() {
        return eiendommer.stream()
            .mapToDouble(Property::getAreal)
            .average()
            .orElse(0);
    }

    public void skrivUtEiendom(Property eiendom) {
        System.out.println(eiendom);
    }

    public void skrivUtAlleEiendommer() {
        if (eiendommer.isEmpty()) {
            System.out.println("Ingen eiendommer er registrert.");
            return;
        }
        System.out.println("Alle registrerte eiendommer:");
        for (Property eiendom : eiendommer) {
            skrivUtEiendom(eiendom);
        }
    }

    public void skrivUtSokResultater(List<Property> sokResultater) {
        if (sokResultater.isEmpty()) {
            System.out.println("Ingen eiendommer funnet.");
            return;
        }
        System.out.println("Søkeresultater:");
        for (Property eiendom : sokResultater) {
            skrivUtEiendom(eiendom);
        }
    }
    public List<Property> finnEiendommerMedGardsnummer(int gardsnummer) {
        return eiendommer.stream()
                .filter(eiendom -> eiendom.getGaardsnummer() == gardsnummer)
                .collect(Collectors.toList());
    }
}
