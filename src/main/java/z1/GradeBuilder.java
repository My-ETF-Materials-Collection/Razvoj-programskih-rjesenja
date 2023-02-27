public class GradeBuilder {
    private final String ime;
    private double kvizovi = 0;
    private double zadace = 0;
    private double parcijalni = 0;
    private double zavrsni = 0;
    private double projekat = 0;
    private double usmeni = 0;
    private double prisustvo = 0;
    private double aktivnost = 0;

    public GradeBuilder(String val){
        ime = val;
    }

    public Grade build() {
        return new Grade(this);
    }

    public GradeBuilder kvizovi(double val) {
        kvizovi = val;
        return this;
    }

    public GradeBuilder zadace(double val) {
        zadace = val;
        return this;
    }

    public GradeBuilder parcijalni(double val) {
        parcijalni = val;
        return this;
    }

    public GradeBuilder zavrsni(double val) {
        zavrsni = val;
        return this;
    }

    public GradeBuilder projekat(double val) {
        projekat = val;
        return this;
    }

    public GradeBuilder usmeni(double val) {
        usmeni = val;
        return this;
    }

    public GradeBuilder prisustvo(double val) {
        prisustvo = val;
        return this;
    }

    public GradeBuilder aktivnost(double val) {
        aktivnost = val;
        return this;
    }

    public String getIme() {
        return ime;
    }

    public double getKvizovi() {
        return kvizovi;
    }

    public double getZadace() {
        return zadace;
    }

    public double getParcijalni() {
        return parcijalni;
    }

    public double getZavrsni() {
        return zavrsni;
    }

    public double getProjekat() {
        return projekat;
    }

    public double getUsmeni() {
        return usmeni;
    }

    public double getPrisustvo() {
        return prisustvo;
    }

    public double getAktivnost() {
        return aktivnost;
    }
}
