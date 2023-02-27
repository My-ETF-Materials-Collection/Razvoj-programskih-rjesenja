public class Grade {
    private final String ime;
    private final double kvizovi;
    private final double zadace;
    private final double parcijalni;
    private final double zavrsni;
    private final double projekat;
    private final double usmeni;
    private final double prisustvo;
    private final double aktivnost;

    public Grade(GradeBuilder builder) {
        ime = builder.getIme();
        kvizovi = builder.getKvizovi();
        zadace = builder.getZadace();
        parcijalni = builder.getParcijalni();
        zavrsni = builder.getZavrsni();
        projekat = builder.getProjekat();
        usmeni = builder.getUsmeni();
        prisustvo = builder.getPrisustvo();
        aktivnost = builder.getAktivnost();
    }

    @Override
    public String toString() {
        double total = kvizovi + zadace + parcijalni + zavrsni + projekat + usmeni + prisustvo + aktivnost;
        return ime + " : " + total + "b";
    }
}
