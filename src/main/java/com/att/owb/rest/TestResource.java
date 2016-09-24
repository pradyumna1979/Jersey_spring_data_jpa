package com.att.owb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.att.owb.entity.User;


@Path("testResource")
public class TestResource {
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getIt() {
    	User user = new User();
    	user.setId(5);
    	user.setName("Pradyumna");
        return user;
    }
}
