public class NyString {
    private final String tekst;

    public NyString(String tekst) {
        this.tekst = tekst;
    }

    public String forkort() {
        String[] ord = tekst.split(" ");
        StringBuilder forkortet = new StringBuilder();
        for (String o : ord) {
            forkortet.append(o.charAt(0));
        }
        return forkortet.toString();
    }

    public String fjernTegn(char tegn) {
        return tekst.replace(Character.toString(tegn), "");
    }
}