public class Main{

    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();

        // Heltall
        for (int i = 0; i < 10; i++) {
            int tilfeldigHeltall = minRandom.nesteHeltall(0, 9);
            System.out.println("Tilfeldig heltall: " + tilfeldigHeltall);
        }

        // Desimaltall
        for (int i = 0; i < 10; i++) {
            double tilfeldigDesimaltall = minRandom.nesteDesimaltall(0.0, 1.0);
            System.out.println("Tilfeldig desimaltall: " + tilfeldigDesimaltall);
        }
    }
}
