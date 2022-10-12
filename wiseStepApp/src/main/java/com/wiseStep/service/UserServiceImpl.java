package com.wiseStep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiseStep.entity.Users;
import com.wiseStep.exceptions.ResourceNotFound;
import com.wiseStep.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UsersRepository usersRepository;
	

	
	@Override
	public Users createUser(Users users) {
		
		
		
		return usersRepository.save(users);
	}

	@Override
	public Users getByid(Integer id) {
		
		return usersRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFound("user not found by this id to show " + id));
	}

	@Override
	public List<Users> getAllUsers() {
		
		return usersRepository.findAll();
	}

}
