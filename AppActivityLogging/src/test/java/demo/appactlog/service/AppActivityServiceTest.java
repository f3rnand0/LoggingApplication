package demo.appactlog.service;

import demo.appactlog.dto.ApplicationActivity;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppActivityServiceTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppActivityServiceTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppActivityServiceTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testLog() {
		new AppActivityService().log(new ApplicationActivity("AppA", "Sending a log test to application A", "INFO"));
		assertTrue(true);
	}
}
