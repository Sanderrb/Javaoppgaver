class Arrangement {
    private final int entydigNummer;
    private final String navn;
    private final String sted;
    private final String arrangør;
    private final String type;
    private final long tidspunkt;

    public Arrangement(int entydigNummer, String navn, String sted, String arrangør, String type, long tidspunkt) {
        this.entydigNummer = entydigNummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getEntydigNummer() {
        return entydigNummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public String getType() {
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }
}