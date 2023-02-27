public class Klasa {

    private static Klasa instance = null;

    private Klasa() {
    }

    static Klasa getInstance() {
        if (instance == null)
            instance = new Klasa();
        return instance;
    }

    static void removeInstance() {
        instance = null;
    }

    @Override
    public String toString() {
        if (instance != null) return "ACTIVE";
        else return "NOT ACTIVE";
    }
}
