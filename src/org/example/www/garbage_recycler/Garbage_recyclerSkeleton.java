
/**
 * Garbage_recyclerSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.garbage_recycler;
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
    	   u.setId(r.getId());
    	   response.setOut(u);
    	   return response;
       }
             
       public org.example.www.garbage_recycler.AddRecyclingToUserResponse addRecyclingToUser
                  (org.example.www.garbage_recycler.AddRecyclingToUser addRecyclingToUser){
    	   throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getTotalRecycling");
       }
     public org.example.www.garbage_recycler.GetAllRecyclingFromUserResponse getAllRecyclingFromUser
                  (org.example.www.garbage_recycler.GetAllRecyclingFromUser getAllRecyclingFromUser){
    	 throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getTotalRecycling");  
     }
      public org.example.www.garbage_recycler.GetTotalRecyclingResponse getTotalRecycling
                  (org.example.www.garbage_recycler.GetTotalRecycling getTotalRecycling){
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getTotalRecycling");
        }
     
    }
    