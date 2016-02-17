package demo.useractlog.dto;

import java.util.Arrays;
import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value = "userActivity", noClassnameStored = true)
public class UserActivity {
	@Id
	private ObjectId id;

	private String userName;
	private String userGenre;
	private Integer userAge;
	private String shippingAddress;
	private String sessionId;
	private String searchInput;
	private String searchSelection;

	@Embedded
	private CheckOutItem[] checkoutItems;

	private Date checkoutDate;
	private Double checkoutCost;
	
	public UserActivity() {
	}

	public UserActivity(String userName, String sessionId, String searchInput) {
		this.userName = userName;
		this.sessionId = sessionId;
		this.searchInput = searchInput;
	}

	public UserActivity(String userName, String userGenre, Integer userAge, String shippingAddress,
			String sessionId, CheckOutItem[] checkoutItems, Date checkoutDate,
			Double checkoutCost) {
		this.userName = userName;
		this.userGenre = userGenre;
		this.userAge = userAge;
		this.shippingAddress = shippingAddress;
		this.sessionId = sessionId;
		this.checkoutItems = checkoutItems;
		this.checkoutDate = checkoutDate;
		this.checkoutCost = checkoutCost;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGenre() {
		return userGenre;
	}

	public void setUserGenre(String userGenre) {
		this.userGenre = userGenre;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
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

	public CheckOutItem[] getCheckoutItems() {
		return checkoutItems;
	}

	public void setCheckoutItems(CheckOutItem[] checkoutItems) {
		this.checkoutItems = checkoutItems;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Double getCheckoutCost() {
		return checkoutCost;
	}

	public void setCheckoutCost(Double checkoutCost) {
		this.checkoutCost = checkoutCost;
	}

	@Override
	public String toString() {
		return "UserActivity [" + (id != null ? "id=" + id + ", " : "")
				+ (userName != null ? "userName=" + userName + ", " : "")
				+ (userGenre != null ? "userGenre=" + userGenre + ", " : "")
				+ (userAge != null ? "userAge=" + userAge + ", " : "")
				+ (shippingAddress != null ? "shippingAddress=" + shippingAddress + ", " : "")
				+ (sessionId != null ? "sessionId=" + sessionId + ", " : "")
				+ (searchInput != null ? "searchInput=" + searchInput + ", " : "")
				+ (searchSelection != null ? "searchSelection=" + searchSelection + ", " : "")
				+ (checkoutItems != null && checkoutItems.length > 0
						? "checkoutItems=" + Arrays.toString(checkoutItems) + ", " : "")
				+ (checkoutDate != null ? "checkoutDate=" + checkoutDate + ", " : "")
				+ (checkoutCost != null ? "checkoutCost=" + checkoutCost : "") + "]";
	}

	/*
	 * public String toString() { return "UserActivity [username=" + userName + ", userGenre=" +
	 * userGenre + ", userAge=" + userAge + ", shippingAddress=" + shippingAddress + ", sessionId="
	 * + sessionId + ", searchInput=" + searchInput + ", searchSelection=" + searchSelection +
	 * ", checkoutItems=" + Arrays.toString(checkoutItems) + ", checkoutDate=" + checkoutDate +
	 * ", checkoutCost=" + checkoutCost + "]"; }
	 */

}
