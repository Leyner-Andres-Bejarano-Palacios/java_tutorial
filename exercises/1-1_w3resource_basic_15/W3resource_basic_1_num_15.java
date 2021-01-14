import java.lang.StringBuffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class W3resource_basic_1_num_15 {


public static boolean executeBashCommand(String command) {
    boolean success = false;
    System.out.println("Executing BASH command:\n   " + command);
    Runtime r = Runtime.getRuntime();
    // Use bash -c so we can handle things like multi commands separated by ; and
    // things like quotes, $, |, and \. My tests show that command comes as
    // one argument to bash, so we do not need to quote it to make it one thing.
    // Also, exec may object if it does not have an executable file as the first thing,
    // so having bash here makes it happy provided bash is installed and in path.
    String[] commands = {"bash", "-c", command};
    try {
        Process p = r.exec(commands);

        p.waitFor();
        BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";

        while ((line = b.readLine()) != null) {
            System.out.println(line);
        }

        b.close();
        success = true;
    } catch (Exception e) {
        System.err.println("Failed to execute bash with command: " + command);
        e.printStackTrace();
    }
    return success;
}


    public static void main(String[] args) {

        W3resource_basic_1_num_15 app = new W3resource_basic_1_num_15();
        System.out.println(app.executeBashCommand("ls $JAVA_HOME/bin/java"));

    }
}