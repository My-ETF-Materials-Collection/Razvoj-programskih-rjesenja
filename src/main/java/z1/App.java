public class App {
    public static void main(String[] args) {
        Grade DM = new GradeBuilder("DM").kvizovi(5.44).zadace(8.97).parcijalni(0).zavrsni(0).usmeni(0).build();
        Grade ASP = new GradeBuilder("ASP").prisustvo(3).zadace(6.5).parcijalni(27).zavrsni(0).build();
        Grade OBP = new GradeBuilder("OBP").prisustvo(10).kvizovi(11).zadace(9.5).zavrsni(0).build();
        Grade RPR = new GradeBuilder("RPR").kvizovi(5).zadace(0).parcijalni(19.67).projekat(0).zavrsni(0).usmeni(0).build();
        Grade SP = new GradeBuilder("SP").prisustvo(10).aktivnost(5).zadace(4).parcijalni(14).zavrsni(0).usmeni(10).build();
        Grade LD = new GradeBuilder("LD").prisustvo(9).zadace(4).parcijalni(14.5).zavrsni(0).build();
        System.out.println(DM);
        System.out.println(ASP);
        System.out.println(OBP);
        System.out.println(RPR);
        System.out.println(SP);
        System.out.println(LD);
    }
}
