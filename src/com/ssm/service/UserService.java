package com.ssm.service;

import java.util.List;

import com.ssm.po.User;

public interface UserService {
	public User findUserById(Integer id) throws Exception;
	public List<User> findUserList() throws Exception;
	public void insertUser(User user) throws Exception;
	public void deleteUser(Integer id) throws Exception;
	public void updateUserName(User user) throws Exception;
}
