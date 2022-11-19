package ba.unsa.etf.rpr;

/**
 * One of the classes inheriting the abstract TelefonskiBroj class.
 * Allows for the registration of mobile phone numbers from different mobile phone operators in Bosnia and Herzegovina.
 */
enum MOBILNA{BH_MOBILE, ERONET, HALOO, MTEL}

public class MobilniBroj extends TelefonskiBroj{
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj){
        StringBuilder sb = new StringBuilder("0");
        if(mobilnaMreza==MOBILNA.BH_MOBILE.ordinal()){
            sb.append("60");
        }
        else if(mobilnaMreza==MOBILNA.ERONET.ordinal()){
            sb.append("63");
        }
        else if(mobilnaMreza==MOBILNA.HALOO.ordinal()){
            sb.append("64");
        }
        else if(mobilnaMreza==MOBILNA.MTEL.ordinal()){
            sb.append("65");
        }
        sb.append("/");
        sb.append(broj);
    }
    @Override
    public String ispisi(){
        return broj;
    }
}
