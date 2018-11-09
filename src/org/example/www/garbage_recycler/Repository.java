package org.example.www.garbage_recycler;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	private static Repository instance = null;
	private Repository() {}
	private List<User> users = new ArrayList<User>();
	private long incrementalid = 0;
	
	public static Repository getInstance() {
		if (Repository.instance == null)
			instance = new Repository();
		return instance;
	}
	
	public void addUser(User user) {
		//add user to users list
		users.add(user);
	}
	
	public long getId() {
		return incrementalid += 1;
	}
	
}
