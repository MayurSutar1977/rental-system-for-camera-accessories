package com.app.services.interfaces;

import java.util.List;

import com.app.dto.ChartDataDto;
import com.app.dto.UserDetailsOutDTO;
import com.app.dto.UserProfileInDto;
import com.app.pojos.entity.User;
import com.app.pojos.entity.UserAddress;
import com.app.pojos.entity.UserProfile;

public interface IUserServices {

	User registerNew(User newUser);

	User getUserById(int userId);

	UserProfile addUserProfile(UserProfileInDto newUser);

	UserProfile getUserProfile(int userId);

	List<User> getUserAll();

	List<UserDetailsOutDTO> getAllUsersOnly();

	UserAddress getUserAddress(int userId);

	UserAddress updateUserAddress(int userId, UserAddress address);

	UserProfile updateProfileImage(int userId, UserProfileInDto newUser);

	User removeUser(int userId);

	ChartDataDto getUsersDataForChart();

	List<User> getAllUsersOnlyLength();

}
