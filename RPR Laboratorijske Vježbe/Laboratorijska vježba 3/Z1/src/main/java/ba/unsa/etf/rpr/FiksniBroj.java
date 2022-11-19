package ba.unsa.etf.rpr;

import java.util.Objects;

/**
 * One of the classes inheriting the abstract TelefonskiBroj class.
 * Allows the registration of fixed telephone numbers from any of the cantons throughout Bosnia and Herzegovina.
 */

enum Grad{SARAJEVO, ZENICA, TRAVNIK, TUZLA, ORASJE, LIVNO, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, BRCKO}

public class FiksniBroj extends TelefonskiBroj{
    private String broj;
    private String pozivniBroj;
    FiksniBroj(Grad grad, String broj){
        this.broj=broj;
        if(grad.equals(Grad.SARAJEVO)){
            pozivniBroj="033";
        }
        else if(grad.equals(Grad.ZENICA)){
            pozivniBroj="032";
        }
        else if(grad.equals(Grad.TRAVNIK)){
            pozivniBroj="030";
        }
        else if(grad.equals(Grad.TUZLA)){
            pozivniBroj="035";
        }
        else if(grad.equals(Grad.ORASJE)){
            pozivniBroj="031";
        }
        else if(grad.equals(Grad.LIVNO)){
            pozivniBroj="034";
        }
        else if(grad.equals(Grad.MOSTAR)){
            pozivniBroj="036";
        }
        else if(grad.equals(Grad.BIHAC)){
            pozivniBroj="037";
        }
        else if(grad.equals(Grad.GORAZDE)){
            pozivniBroj="038";
        }
        else if(grad.equals(Grad.SIROKI_BRIJEG)){
            pozivniBroj="039";
        }
        else if(grad.equals(Grad.BRCKO)){
            pozivniBroj="049";
        }
    }
    @Override
    public String ispisi(){
        StringBuilder sb = new StringBuilder(pozivniBroj);
        sb.append("/");
        sb.append(broj);
        return sb.toString();
    }
}
