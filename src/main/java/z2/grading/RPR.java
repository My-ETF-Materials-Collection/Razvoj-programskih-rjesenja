package grading;

public class RPR implements Grading {
    private String naziv = "RPR";

    @Override
    public String toString() {
        return naziv + " { kvizovi : 5, zadace : 5, projekat : 20, parcijalni ispit : 20, zavrsni ispit : 20, usmeni ispit : 30 }";
    }
}