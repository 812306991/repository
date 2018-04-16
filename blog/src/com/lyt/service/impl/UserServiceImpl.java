package com.lyt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lyt.mapper.UserMapper;
import com.lyt.model.User;
import com.lyt.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper mapper;

	@Override
	public void save(User user) {
		mapper.save(user);
		
	}

	@Override
	public boolean update(User user) {
		return mapper.update(user);
	}

	@Override
	public boolean delete(int id) {
		return mapper.delete(id);
	}

	@Override
	public User findById(int id) {
		User user=mapper.findById(id);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> findAllList=mapper.findAll();
		return findAllList;
	}
}
