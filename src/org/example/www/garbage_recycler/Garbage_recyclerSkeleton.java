
/**
 * Garbage_recyclerSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.garbage_recycler;

import java.util.ArrayList;
import java.util.List;

/**
     *  Garbage_recyclerSkeleton java skeleton for the axisService
     */
    public class Garbage_recyclerSkeleton{
        
         
       public org.example.www.garbage_recycler.RegisterUserResponse registerUser
                  (org.example.www.garbage_recycler.RegisterUser registerUser){
    	   Repository r = Repository.getInstance();
    	   RegisterUserResponse response = new RegisterUserResponse(); 
    	   User u = registerUser.getUser();
    	   r.addUser(u);
    	   u.setId(r.getUserId());
    	   response.setOut(u);
    	   return response;
       }
             
       public org.example.www.garbage_recycler.AddRecyclingToUserResponse addRecyclingToUser
                  (org.example.www.garbage_recycler.AddRecyclingToUser addRecyclingToUser){
    	   Repository r = Repository.getInstance();
    	   AddRecyclingToUserResponse response = new AddRecyclingToUserResponse();
    	   String username = addRecyclingToUser.getUsername();
    	   User u = r.getUser(username);
    	   u.setUsername(username);
    	   UserRecycling user = new UserRecycling();
    	   user.setId(r.getUserRecyclingId());
    	   user.setUser(u);
    	   user.setBottles(addRecyclingToUser.getUserRecycling().getBottles());
    	   user.setTetrabricks(addRecyclingToUser.getUserRecycling().getTetrabricks());
    	   user.setGlass(addRecyclingToUser.getUserRecycling().getGlass());
    	   user.setPaperboards(addRecyclingToUser.getUserRecycling().getPaperboards());
    	   user.setCans(addRecyclingToUser.getUserRecycling().getCans());
    	   r.setUserRecycling(user);
    	   response.setOut(user);
    	   return response;
       }
       
       public org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse getAllRecyclingFromUser
                  (org.example.www.garbage_recycler.GetAllRecyclingFromUser getAllRecyclingFromUser){
    	   Repository r = Repository.getInstance();
    	   GetAllRecyclingFromUserResponse response = new GetAllRecyclingFromUserResponse();
    	   String username = getAllRecyclingFromUser.getUsername(); 
    	   User u = new User();
    	   u.setUsername(username);
    	   UserRecycling [] res = r.getAllRecyclersFromUser(u.getUsername()); 
    	   response.setOut(res);
    	   return response;
       }
       
      public org.example.www.garbage_recycler.GetTotalRecyclingResponse getTotalRecycling
                  (org.example.www.garbage_recycler.GetTotalRecycling getTotalRecycling){
    	  GetTotalRecyclingResponse response = new GetTotalRecyclingResponse();
    	  Repository r = Repository.getInstance();
    	  Recycling calculateRecycling = r.getTotalRecycling();
    	  response.setOut(calculateRecycling);
    	  return response;
       }
     
    }
    