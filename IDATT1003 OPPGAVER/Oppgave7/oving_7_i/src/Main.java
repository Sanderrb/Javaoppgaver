public class Main {


    public static void main(String[] args) {
        NyString nyTekst = new NyString("denne setningen kan forkortes");
        System.out.println(nyTekst.forkort());  // Skriver ut: "dskf"
        System.out.println(nyTekst.fjernTegn('e'));  // Skriver ut: "dnn stningn kan forkorts"
    }
}