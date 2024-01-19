package lab12;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({ checkEven.class, checkOdd.class, checkPrime.class, testFactorial.class })
public class AllTests {
}
