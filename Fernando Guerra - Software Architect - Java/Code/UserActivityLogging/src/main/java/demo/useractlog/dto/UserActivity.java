package demo.useractlog.dto;

import java.util.Arrays;
import java.util.Date;

public class UserActivity {

	private String username;
	private String userGenre;
	private String userAge;
	private String shippingAddress;
	private String sessionId;
	private String searchInput;
	private String searchSelection;
	private CheckoutItem[] checkoutItems;
	private Date checkoutDate;
	private String checkoutCost;

	public UserActivity() {
	}

	public UserActivity(String username, String sessionId, String searchInput) {
		super();
		this.username = username;
		this.sessionId = sessionId;
		this.searchInput = searchInput;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserGenre() {
		return userGenre;
	}

	public void setUserGenre(String userGenre) {
		this.userGenre = userGenre;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSearchInput() {
		return searchInput;
	}

	public void setSearchInput(String searchInput) {
		this.searchInput = searchInput;
	}

	public String getSearchSelection() {
		return searchSelection;
	}

	public void setSearchSelection(String searchSelection) {
		this.searchSelection = searchSelection;
	}

	public CheckoutItem[] getCheckoutItems() {
		return checkoutItems;
	}

	public void setCheckoutItems(CheckoutItem[] checkoutItems) {
		this.checkoutItems = checkoutItems;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getCheckoutCost() {
		return checkoutCost;
	}

	public void setCheckoutCost(String checkoutCost) {
		this.checkoutCost = checkoutCost;
	}

	@Override
	public String toString() {
		return "UserActivity [username=" + username + ", userGenre=" + userGenre + ", userAge="
				+ userAge + ", shippingAddress=" + shippingAddress + ", sessionId=" + sessionId
				+ ", searchInput=" + searchInput + ", searchSelection=" + searchSelection
				+ ", checkoutItems=" + Arrays.toString(checkoutItems) + ", checkoutDate="
				+ checkoutDate + ", checkoutCost=" + checkoutCost + "]";
	}
}
