package com.wiseStep.service;

import java.util.List;

import com.wiseStep.entity.Locker;

public interface LockerService {

	public Locker createLocker(Locker locker);

	public Locker getByid(Integer id);

	public List<Locker> getAllLocker();

}
