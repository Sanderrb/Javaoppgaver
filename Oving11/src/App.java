public class App {
    public static void main(String[] args) {
        PropertyRegistry registry = new PropertyRegistry();
        registry.leggTilTestdata(); // Legger til testdata
        UserInterface ui = new UserInterface(registry);
        ui.start(); 

    }
}
