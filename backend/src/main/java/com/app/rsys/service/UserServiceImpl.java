package com.app.rsys.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.rsys.dao.IUserRepo;
import com.app.rsys.interfaces.IUserService;
import com.app.rsys.pojos.model.User;
@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepo userRepo;
	
	@Override
	public List<User> getAllUser() {
		
		return userRepo.findAll();
		
	}

	@Override
	public User createNewUser(User newUser) {
		newUser.setRegistrationDate(LocalDate.now());
		return userRepo.save(newUser);
	}

}
