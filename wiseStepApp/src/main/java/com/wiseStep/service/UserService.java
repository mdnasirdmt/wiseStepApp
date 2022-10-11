package com.wiseStep.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wiseStep.entity.Users;

@Service
public interface UserService {

	public Users createUser(Users users);

	public Users getByid(Integer id);

	public List<Users> getAllUsers();

}