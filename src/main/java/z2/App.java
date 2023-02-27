import grading.*;

public class App {
    public static void main(String[] args) {
        Grading x1 = GradingFactory.getSubject("DM");
        Grading x2 = GradingFactory.getSubject("RPR");
        Grading x3 = GradingFactory.getSubject("SP");

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
