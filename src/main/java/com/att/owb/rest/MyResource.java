package com.att.owb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.att.owb.entity.User;
import com.att.owb.service.UserService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Component
@Path("myresource")

public class MyResource {
@Autowired
   UserService UserService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getIt() {
    	User user = new User();
    	user.setId(5);
    	user.setName("Pradyumna");
        return user;
    	
       // return UserService.findUserById(1);
    }
}
