import java.util.GregorianCalendar;

public class ArbTaker {
    private Person personalia;
    private int arbtakernr;
    private int ansettelsesar;
    private double manedslonn;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesar, double manedslonn, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesar = ansettelsesar;
        this.manedslonn = manedslonn;
        this.skatteprosent = skatteprosent;
    }

    public double skattetrekkPerManed() {
        return manedslonn * skatteprosent / 100;
    }

    public double bruttolonnPerAr() {
        return manedslonn * 12;
    }

    public double skattetrekkPerAr() {
        return (skattetrekkPerManed() * 11) + (skattetrekkPerManed() / 2);
    }

    public String navn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    public int alder() {
        GregorianCalendar kalender = new GregorianCalendar();
        int ar = kalender.get(java.util.Calendar.YEAR);
        return ar - personalia.getFodselsar();
    }

    public int antallArAnsatt() {
        GregorianCalendar kalender = new GregorianCalendar();
        int ar = kalender.get(java.util.Calendar.YEAR);
        return ar - ansettelsesar;
    }

    //public boolean harVartAnsattMerEnn(int antallAr) {
       // return antallArAnsatt() > antallAr;}


    public void setManedslonn(double manedslonn) {
        this.manedslonn = manedslonn;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    @Override
    public String toString() {
        return "ArbTaker" +
                "navn='" + navn() + '\'' +
                ", arbtakernr=" + arbtakernr +
                ", ansettelsesar=" + ansettelsesar +
                ", manedslonn=" + manedslonn +
                ", skatteprosent=" + skatteprosent;
    }
}
