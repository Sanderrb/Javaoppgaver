class Valuta {

    double kurs;
    String navn;

    public Valuta(String navn, double kurs) {
        this.kurs = kurs;
        this.navn = navn;
    }

    void konvertering(double norskeKr) {
        double belop = norskeKr * kurs;
        System.out.println("Beløpet i norske kroner er " + belop);
    }
}