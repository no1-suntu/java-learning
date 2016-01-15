package eric.junit;

import org.junit.Test;

/**
 * Created by root on 1/15/16.
 */
public class TestJunit12 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi! " + "Robert";
        org.junit.Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
