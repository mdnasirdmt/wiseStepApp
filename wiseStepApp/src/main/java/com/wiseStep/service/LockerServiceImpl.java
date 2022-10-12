package com.wiseStep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiseStep.entity.Locker;
import com.wiseStep.exceptions.ResourceNotFound;
import com.wiseStep.repository.LockerRepository;


@Service
public class LockerServiceImpl implements LockerService{

	@Autowired
	private LockerRepository lockerRepository;
	
	@Override
	public Locker createLocker(Locker locker) {
		
		return lockerRepository.save(locker);
	}

	@Override
	public Locker getByid(Integer id) {
		
		return lockerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFound("user not found by this id to show " + id));
	}

	@Override
	public List<Locker> getAllLocker() {
		
		return lockerRepository.findAll();
	}

}
