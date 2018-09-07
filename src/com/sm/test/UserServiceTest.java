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
	//这里需要使用ApplicationContext，也就是Spring的BeanFactory的一个子类，需要创建工厂，然后通过工厂获取相应的类

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
		//但是这种操作就是最原始的使用Spring的依赖注入的方式。当然现在还是使用注解更加方便
		//UserQueryMapper我们在当前使用的时候只是从容器中获取一个叫userQueryMapper的Bean，但是不需要知道这个Bean的具体内容。
		//这个Bean的实例从初始化到创建都是由spring来完成的。
		UserQueryMapper userQueryMapper = (UserQueryMapper)applicationContext.getBean("userQueryMapper");
		User user = userQueryMapper.findUserById(3);
		System.out.println(user.getUsername()+"   "+user.getProvince());
	}
}
