package ba.unsa.etf.rpr;

/**
 * One of the classes inheriting the abstract TelefonskiBroj class.
 * Allows for the registration of international telephone numbers corresponding to different countries.
 */

public class MedunarodniBroj extends TelefonskiBroj{
    private String broj;
    MedunarodniBroj(String drzava, String broj){
        StringBuilder sb = new StringBuilder(drzava);
        sb.append("/");
        sb.append(broj);
        broj=sb.toString();
    }
    @Override
    public String ispisi(){
        return broj;
    }
}
