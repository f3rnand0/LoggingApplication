package demo.appactlog.dto;

public class ApplicationActivity {

	private String applicationName;
	private String activity;
	private String activityType;

	public ApplicationActivity() {
	}

	public ApplicationActivity(String applicationName, String activity, String activityType) {

		this.applicationName = applicationName;
		this.activity = activity;
		this.activityType = activityType;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	@Override
	public String toString() {
		return new StringBuffer(" Application name : ").append(this.applicationName)
				.append(", Activity : ").append(this.activity).append(", Activity type : ")
				.append(this.activityType).toString();
	}
}
