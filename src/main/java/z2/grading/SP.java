package grading;

public class SP implements Grading {
    private String naziv = "SP";

    @Override
    public String toString() {
        return naziv + " { aktivnost : 5, prisustvo : 10, zadace : 10, parcijalni ispit : 20, zavrsni ispit : 20, usmeni ispit : 40 }";
    }
}
