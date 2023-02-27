package grading;

public class DM implements Grading {
    private String naziv = "DM";

    @Override
    public String toString() {
        return naziv + " { kvizovi : 10, zadace : 20, parcijalni ispit : 20, zavrsni ispit : 30, usmeni ispit : 20 }";
    }
}