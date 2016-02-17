package demo.appactlog.dto;

@FunctionalInterface
public interface LogServiceMethod {
	public void execute(ApplicationActivity act);
}
