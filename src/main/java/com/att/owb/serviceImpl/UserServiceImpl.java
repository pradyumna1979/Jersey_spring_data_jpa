package com.att.owb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.att.owb.entity.User;
import com.att.owb.repository.UserRepository;
import com.att.owb.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
 private UserRepository userRepository;
	@Override
	public void save(User user) {
		userRepository.save(user);
	}
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

}
