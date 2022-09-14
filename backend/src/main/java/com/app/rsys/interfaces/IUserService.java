package com.app.rsys.interfaces;

import java.util.List;

import com.app.rsys.pojos.model.User;

public interface IUserService {

	List<User> getAllUser();

	User createNewUser(User newUser);
}
