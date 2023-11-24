public class Property {
    private int kommunenummer;
    private String kommunenavn;
    private int gaardsnummer;
    private int bruksnummer;
    private String bruksnavn;
    private double areal;
    private String eierNavn;

    // Konstruktør
    public Property(int kommunenummer, String kommunenavn, int gaardsnummer, int bruksnummer, String bruksnavn, double areal, String eierNavn) {
        this.kommunenummer = kommunenummer;
        this.kommunenavn = kommunenavn;
        this.gaardsnummer = gaardsnummer;
        this.bruksnummer = bruksnummer;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }

    // Gettere
    public int getKommunenummer() {
        return kommunenummer;
    }

    public String getKommunenavn() {
        return kommunenavn;
    }

    public int getGaardsnummer() {
        return gaardsnummer;
    }

    public int getBruksnummer() {
        return bruksnummer;
    }

    public String getBruksnavn() {
        return bruksnavn;
    }

    public double getAreal() {
        return areal;
    }

    public String getEierNavn() {
        return eierNavn;
    }

    // Settere
    public void setKommunenummer(int kommunenummer) {
        this.kommunenummer = kommunenummer;
    }

    public void setKommunenavn(String kommunenavn) {
        this.kommunenavn = kommunenavn;
    }
    public String getEiendomsIdentifikator() {
        return String.format("%d-%d/%d", kommunenummer, gaardsnummer, bruksnummer);
    }

    public void setGaardsnummer(int gaardsnummer) {
        this.gaardsnummer = gaardsnummer;
    }

    public void setBruksnummer(int bruksnummer) {
        this.bruksnummer = bruksnummer;
    }

    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public void setEierNavn(String eierNavn) {
        this.eierNavn = eierNavn;
    }

    @Override
    public String toString() {
        String eiendomsIdentifikator = String.format("%d-%d/%d", kommunenummer, gaardsnummer, bruksnummer);
        return "Eiendom{" +
                "kommunenummer-gårdsnummer/bruksnummer='" + eiendomsIdentifikator + '\'' +
                ", kommunenavn='" + kommunenavn + '\'' +
                ", bruksnavn='" + (bruksnavn.isEmpty() ? "Ikke oppgitt" : bruksnavn) + '\'' +
                ", areal=" + areal +
                " m2, eier='" + eierNavn + '\'' +
                '}';
    }
    

    
}
