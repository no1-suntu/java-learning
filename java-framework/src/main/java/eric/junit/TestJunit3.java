package eric.junit;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
/**
 * Created by root on 1/15/16.
 */
public class TestJunit3 extends TestResult {
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test)test, t);
    }

    public synchronized void addFailure(Test test, AssertionFailedError r) {
        super.addFailure((junit.framework.Test) test, r);
    }

    @Test
    public void testAdd() {}

    public synchronized void stop() {}
}
