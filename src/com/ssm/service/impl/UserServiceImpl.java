package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
import com.ssm.service.UserService;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Resource(name = "userDao")
	UserDao userDao;
	@Override
	public User findUserById(Integer id) throws Exception {
		User user = userDao.findUserById(id);
		return user;
	}
	@Override
	public List<User> findUserList() throws Exception {
		List<User> list = userDao.findUserList();
		return list;
	}
	@Override
	public void insertUser(User user) throws Exception {
		userDao.insertUser(user);
		
	}
	@Override
	public void deleteUser(Integer id) throws Exception {
		userDao.deleteUser(id);
		
	}
	@Override
	public void updateUserName(User user) throws Exception {
		userDao.updateUserName(user);
		
	}
	

}
