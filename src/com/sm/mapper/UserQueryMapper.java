package com.sm.mapper;

import com.sm.po.User;
/**
 * mapper�Ķ�̬����(�ô��������xml�ļ����������ӿڷ���ͬһ�����£���������ȫһ��)
 * @author liyang
 *
 */
public interface UserQueryMapper {
	public User findUserById(int id) throws Exception;
}
