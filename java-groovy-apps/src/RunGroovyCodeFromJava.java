import org.junit.Test;

public class RunGroovyCodeFromJava {
    public static void main(String[] args) {
        TestGroovyScipt script = new TestGroovyScipt();
        //script.main(args);
        //script.run();    // run is a wrapper for static method main
        TestGroovyScipt.main(args);   // main is a static method
        //TestGroovyScipt.run();        // this will fail as run is a non static method
    }
}
