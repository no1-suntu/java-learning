package eric.junit;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Created by root on 1/15/16.
 */
public class JunitTestSuite {
    public static void main(String[] args) {
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("No. of test cases: " + result.runCount());
    }
}
