package grading;

public class GradingFactory {
    public static Grading getSubject(String spec) {
        switch (spec) {
            case "DM":
                return new DM();
            case "RPR":
                return new RPR();
            case "SP":
                return new SP();
            default:
                throw new RuntimeException();
        }
    }
}
