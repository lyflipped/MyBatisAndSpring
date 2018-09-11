package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.po.User;
/**
 * mapper�Ķ�̬����(�ô��������xml�ļ����������ӿڷ���ͬһ�����£���������ȫһ��)
 * @author liyang
 *
 */
@Repository("userDao")
public interface UserDao {
	public User findUserById(Integer id) throws Exception;
	public List<User> findUserList() throws Exception;
	public void insertUser(User user) throws Exception;
	public void deleteUser(Integer id) throws Exception;
	public void updateUserName(User user) throws Exception;
}
