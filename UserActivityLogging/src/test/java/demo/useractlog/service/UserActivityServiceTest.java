package demo.useractlog.service;

import java.sql.Date;
import java.time.Instant;

import demo.useractlog.dto.CheckOutItem;
import demo.useractlog.dto.UserActivity;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class UserActivityServiceTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public UserActivityServiceTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(UserActivityServiceTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testLogSearch() {
		new UserActivityService()
				.logUserActivity(new UserActivity("arussell", "j6oAOxCWZh/CD723LGeXlf", "shoes"));
		assertTrue(true);
	}

	public void testLogCheckoutStep() {
		CheckOutItem[] items = { new CheckOutItem("adidas performance SNK", 1),
				new CheckOutItem("Globmall M8S Fully Loaded KODI Quad Core", 2) };
		new UserActivityService().logUserActivity(new UserActivity("arussell", "male",
				23, "2101 MASSACHUSETTS AVE NW. WASHINGTON DC 20008", "j6oAOxCWZh/CD723LGeXlf",
				items, Date.from(Instant.now()), 28.69d));
		assertTrue(true);
	}
}
