package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.entity.UserAddress;
import com.app.pojos.entity.UserProfile;

public interface IUserAddressRepository extends JpaRepository<UserAddress, Integer> {

	Optional<UserAddress> findByUserProfile(UserProfile userProfile);

}
