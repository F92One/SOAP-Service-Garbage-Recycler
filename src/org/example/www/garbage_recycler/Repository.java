package org.example.www.garbage_recycler;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	private static Repository instance = null;
	private Repository() {}
	private List<User> users = new ArrayList<User>();
	private List<UserRecycling> recycles = new ArrayList<UserRecycling>();
	private long incrementalUserid = 0;
	private long incrementalRecyclerid = 0;
	
	private static final int BOTTLES_WEIGHT = 100; //en gramos
	private static final int TETRABRICKS_WEIGHT = 100; //en gramos
	private static final int GLASS_WEIGHT = 100; //en gramos
	private static final int PAPERBOARD_WEIGHT = 100; //en gramos
	private static final int CANS_WEIGHT = 100; //en gramos
	
	public static Repository getInstance() {
		if (Repository.instance == null)
			instance = new Repository();
		return instance;
	}
	
	public void addUser(User user) {
		//add user to users list
		users.add(user);
	}
	
	public long getUserId() {
		return incrementalUserid += 1;
	}
	
	public long getUserRecyclingId() {
		return incrementalRecyclerid += 1;
	}
	
	public User getUser(String username) {
		for (User u: users) {
			if (u.getUsername().equals(username))
				return u;
		}
		return null;
	}
	
	public UserRecycling getUserRecycling(String username) {
		for (UserRecycling u: recycles)
			if (u.getUser().getUsername() == username)
				return u;
		return null;
	}
	
	public void setUserRecycling(UserRecycling user) {
	//implementar excepcion, si el id que quiero ingresar ya existe, me tiene que denegar la operacion
		recycles.add(user);
	}
	
}
