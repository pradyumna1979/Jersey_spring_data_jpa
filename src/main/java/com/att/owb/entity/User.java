package com.att.owb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="user")
@XmlRootElement
public class User {
@Id
@GeneratedValue
Integer id;

private String name;
@JsonProperty("First_name")
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

}
