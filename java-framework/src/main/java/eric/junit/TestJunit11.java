package eric.junit;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by root on 1/15/16.
 */
public class TestJunit11 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        org.junit.Assert.assertEquals(message, messageUtil.printMessage());
        System.out.println(Arrays.asList(new Object[][] {
                {2,true},
                {6,false},
                {19,false}
        }));
    }
}
