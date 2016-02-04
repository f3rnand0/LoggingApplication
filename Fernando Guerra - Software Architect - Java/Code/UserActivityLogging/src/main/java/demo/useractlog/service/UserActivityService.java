package demo.useractlog.service;

import java.util.Date;

import demo.useractlog.dto.CheckoutItem;

/**
 * Hello world!
 *
 */
public class UserActivityService {

	// TODO
	// Get user data and save it in mongo database using mongo java driver for al three methods

	public static void logSearch(String username, String sessionId, String searchInput) {
	}

	public static void logResultsSelection(String username, String sessionId,
			String searchSelection) {
	}

	public static void logCheckoutStep(String username, String userGenre,
			String userAge, String shippingAddress, String sessionId, CheckoutItem[] checkoutItems,
			Date checkoutDate, String checkoutCost) {
	}
}
