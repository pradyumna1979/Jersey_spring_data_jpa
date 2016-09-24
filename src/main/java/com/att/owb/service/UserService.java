/**
 * 
 */
package com.att.owb.service;


import com.att.owb.entity.User;

/**
 * @author Pratyushaa
 *
 */

public interface UserService {
public void save(User user);
public User findUserById(Integer id);
}
