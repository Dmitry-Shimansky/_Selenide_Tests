package demoTestSelenide.runner;

import demoTestSelenide.tests.BookingLoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingLoginTest.class,
})
public class JUnitRunner {
}
