import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Check input string as an IPv4 address
 */
public class IPv4Check {
    /**
     * Main method
     * @params args Command line arguments. Further string arguments after the 1st one is ignored. 
     */
    public static void main(String[] args) {
        // Pattern for IPv4 format
        String ipV4Pattern = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        Pattern pattern = Pattern.compile(ipV4Pattern);

        // Check input against pattern
        if (args.length == 0) {
            System.out.println("No input");
        } else if (args.length > 0 && pattern.matcher(args[0]).matches())
            System.out.println(args[0] + " is a valid IPv4 address");
        else {
            System.out.println(args[0] + " is not a valid IPv4 address");
        }
    }
}
