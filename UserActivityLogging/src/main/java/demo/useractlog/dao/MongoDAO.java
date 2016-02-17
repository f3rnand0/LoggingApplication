package demo.useractlog.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoDAO {

	private final Morphia morphia = new Morphia();
	public final Datastore datastore;

	private static MongoDAO instance = null;

	protected MongoDAO() {
		morphia.mapPackage("demo.useractlog.dto");
		datastore = morphia.createDatastore(new MongoClient(), "users");
		datastore.ensureIndexes();
	}

	public static MongoDAO getInstance() {
		if (instance == null) {
			instance = new MongoDAO();
		}
		return instance;
	}

}
