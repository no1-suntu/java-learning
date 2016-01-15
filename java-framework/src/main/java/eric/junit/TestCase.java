package eric.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by root on 1/15/16.
 */
public class TestCase {
    String message = "Hello world";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "New world";
        assertEquals(message, messageUtil.printMessage());
    }
}
