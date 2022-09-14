package com.app.rsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.rsys.pojos.model.User;

public interface IUserRepo extends JpaRepository<User, Integer>{

	
}
