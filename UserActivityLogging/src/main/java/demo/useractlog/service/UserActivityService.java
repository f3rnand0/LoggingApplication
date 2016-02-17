package demo.useractlog.service;

import javax.ejb.Stateless;

import demo.useractlog.dao.MongoDAO;
import demo.useractlog.dto.UserActivity;

@Stateless
public class UserActivityService {

	public void logUserActivity(UserActivity usrAct) {
		MongoDAO.getInstance().datastore.save(usrAct);
	}

}
