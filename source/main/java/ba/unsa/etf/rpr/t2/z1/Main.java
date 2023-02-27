package ba.unsa.etf.rpr.t2.z1;

/**
 * Entry point to our math program
 */
public class Main {

    public static void main( String[] args ){
        if (args.length != 2){
            System.err.println("Insufficient number of arguments java -jar RPR-Tutorial2_Z1.jar [function] [argument]");
        } else if (!args[0].equals("sinus") && !args[0].equals("factorial")) {
            System.err.println("Invalid function, sine and factorial are supported functions");
        }else{
            try {
                String function = args[0];
                double input = Double.parseDouble(args[1]);
                switch (function){
                    case "sinus":
                        System.out.println("sinus("+input+")="+Math.sin(input));
                        break;
                    case "factorial":
                        System.out.println("factorial("+input+")="+Math.factorial((int)input));
                        break;
                }
            }catch (Exception e){
                System.err.println("Invalid second argument, must be a number");
            }
        }
    }
}