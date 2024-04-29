package com.devmonk.UserRegistration.service;

import com.devmonk.UserRegistration.dto.UserDto;
import com.devmonk.UserRegistration.model.User;

public interface UserService {
	
	User save (UserDto userDto);
	

}
