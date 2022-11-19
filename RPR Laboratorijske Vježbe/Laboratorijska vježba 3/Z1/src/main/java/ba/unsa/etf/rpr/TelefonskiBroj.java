package ba.unsa.etf.rpr;

import java.util.Objects;

/**

 * An abstract class containing an abstract method for printing out telephone numbers, as well
   as the well known overridden hashCode function.
 * Several classes will inherit the one written here.

*/

abstract public class TelefonskiBroj {
    private String ime;
    public abstract String ispisi();
    @Override
    public int hashCode() {
        return Objects.hash();
    }
}
