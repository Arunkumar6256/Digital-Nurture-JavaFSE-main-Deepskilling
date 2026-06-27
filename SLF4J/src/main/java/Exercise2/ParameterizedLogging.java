package Exercise2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLogging {
    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Arunkumar";
        int age = 21;
        String erorMessage = "Server error";
        logger.info("Name: {}, Age: {}", name, age);
        logger.error("The error message is: {}", erorMessage);
    }
}
