package SingletonPatternExample;
public class SingletonTest {
    public static void main(String[] args) {

        SingletonPatternExample.Logger logger1 = SingletonPatternExample.Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = SingletonPatternExample.Logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances created.");
        }
    }
}