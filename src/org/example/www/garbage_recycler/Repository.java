package org.example.www.garbage_recycler;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	private static Repository instance = null;
	private Repository() {}
	private List<User> users = new ArrayList<>();
	private List<UserRecycling> recycles = new ArrayList<>();
	private long incrementalUserid = 0;
	private long incrementalRecyclerid = 0;
	
	private static final float BOTTLE_WEIGHT = 0.1f; //en kg
	private static final float TETRABRICK_WEIGHT = 0.075f; //en kg
	private static final float GLASS_WEIGHT = 0.25f; //en kg
	private static final float PAPERBOARD_WEIGHT = 0.15f; //en kg
	private static final float CANS_WEIGHT = 0.05f; //en kg
		
	public static float fijarNumero(float numero, int digitos) {
        float resultado;
        resultado = numero * (float) Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado/ (float) Math.pow(10, digitos);
        return resultado;
    }
	
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
	
	public UserRecycling [] getAllRecyclersFromUser(String username){
		List<UserRecycling> res = new ArrayList<>();
		for (UserRecycling u: recycles) { 
			if (u.getUser().getUsername().equals(username))
				res.add(u);
		}
		return ((UserRecycling []) res.toArray(new UserRecycling[recycles.size()]));
	}
	
	public Recycling getTotalRecycling() {
		Recycling res = new Recycling();
		int bottles = 0; 
		int tetrabricks = 0;
		int glass = 0;
		int paperboard = 0;
		int cans = 0;
		for (UserRecycling ur: recycles) {
			bottles += ur.getBottles();
			tetrabricks += ur.getTetrabricks();
			glass += ur.getGlass();
			paperboard += ur.getPaperboards();
			cans += ur.getCans();			
		}
		res.setBottles(bottles);
		res.setTetrabricks(tetrabricks);
		res.setGlass(glass);
		res.setPaperboard(paperboard);
		res.setCans(cans);
		float formula = (((bottles * BOTTLE_WEIGHT) + (tetrabricks * TETRABRICK_WEIGHT) + (glass * GLASS_WEIGHT) + (paperboard * PAPERBOARD_WEIGHT) + (cans * CANS_WEIGHT)) / 1000);
		res.setTons(fijarNumero(formula,5));    
		return res;
	}
}
