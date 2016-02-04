package demo.appactlog.dto;

@FunctionalInterface
public interface LogServiceMethod {
	public void execute(String activity, String activityType);
}
