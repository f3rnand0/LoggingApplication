package demo.logging.ws;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import demo.appactlog.dto.ApplicationActivity;
import demo.appactlog.service.AppActivityService;
import demo.useractlog.dto.UserActivity;
import demo.useractlog.service.UserActivityService;

@Stateless
@Path("/logActivity")
public class LoggingWebService {

	@Inject
	private AppActivityService app;
	@Inject
	private UserActivityService usr;

	@POST
	@Path("/APPlogApplication")
	@Consumes("application/json")
	public Response consumeJSON(ApplicationActivity act) {
		this.app.log(act);
		String output = act.toString();
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/APPlogApplication/print/{appActivity}")
	@Produces("application/json")
	public ApplicationActivity produceJSON1(@PathParam("appActivity") String appActivity) {
		ApplicationActivity act = new ApplicationActivity("appA", appActivity, "INFO");
		return act;
	}

	@POST
	@Path("/USRlogSearch")
	@Consumes("application/json")
	public Response consumeJSON(UserActivity act) {
		this.usr.logUserActivity(act);
		String output = act.toString();
		return Response.status(200).entity(output).build();
	}

	@POST
	@Path("/USRlogResultsSelection")
	@Consumes("application/json")
	public Response consumeJSON2(UserActivity act) {
		this.usr.logUserActivity(act);
		String output = act.toString();
		return Response.status(200).entity(output).build();
	}

	@POST
	@Path("/USRlogCheckoutStep")
	@Consumes("application/json")
	public Response consumeJSON3(UserActivity act) {
		this.usr.logUserActivity(act);
		String output = act.toString();
		return Response.status(200).entity(output).build();
	}

}
