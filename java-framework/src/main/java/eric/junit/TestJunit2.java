package eric.junit;

import junit.framework.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by root on 1/15/16.
 */
public class TestJunit2  extends junit.framework.TestCase{
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setup() {
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd() {
        System.out.println("No of Test Case = " + this.countTestCases());

        String name = this.getName();
        System.out.println("Test case Name = " + name);

        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated Test Case Name = " + newName);
    }

    public void tearDown() {}
}
