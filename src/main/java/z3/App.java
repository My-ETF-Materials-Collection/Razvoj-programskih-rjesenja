public class App {
    public static void main(String[] args) {
        Klasa x1 = Klasa.getInstance();
        System.out.println(x1);
        Klasa x2 = Klasa.getInstance();
        System.out.println(x2);
        Klasa.removeInstance();
        System.out.println(x1);
        System.out.println(x2);
    }
}
