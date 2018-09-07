package com.sm.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.sm.dao.UserDao;
import com.sm.mapper.UserQueryMapper;
import com.sm.po.User;

public class UserServiceTest {
	//������Ҫʹ��ApplicationContext��Ҳ����Spring��BeanFactory��һ�����࣬��Ҫ����������Ȼ��ͨ��������ȡ��Ӧ����

	private static ApplicationContext applicationContext;
	@Before
	public void setup() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
//	@Test
//	public void testFindUserById(int id) throws Exception{
//		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
//		User user = userDao.findUserById(1);
//		System.out.println(user.getUsername()+"   "+user.getProvince());
//	}
	public static void main(String[] args) throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
//		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		//�������ֲ���������ԭʼ��ʹ��Spring������ע��ķ�ʽ����Ȼ���ڻ���ʹ��ע����ӷ���
		//UserQueryMapper�����ڵ�ǰʹ�õ�ʱ��ֻ�Ǵ������л�ȡһ����userQueryMapper��Bean�����ǲ���Ҫ֪�����Bean�ľ������ݡ�
		//���Bean��ʵ���ӳ�ʼ��������������spring����ɵġ�
		UserQueryMapper userQueryMapper = (UserQueryMapper)applicationContext.getBean("userQueryMapper");
		User user = userQueryMapper.findUserById(3);
		System.out.println(user.getUsername()+"   "+user.getProvince());
	}
}
