package com.wiseStep.service;

import java.util.List;
import com.wiseStep.entity.Users;


public interface UserService {

	public Users createUser(Users users);

	public Users getByid(Integer id);

	public List<Users> getAllUsers();

}
