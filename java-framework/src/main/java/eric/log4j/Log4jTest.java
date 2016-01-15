package eric.log4j;

import org.apache.log4j.Logger;

/**
 * Created by root on 1/15/16.
 */
public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.debug("this is debug message");

        logger.info("this is info message");

        logger.error("this is error message");
    }
}
