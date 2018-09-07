package com.sm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.dao.UserDao;
import com.sm.po.User;
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
	        super.setSqlSessionFactory(sqlSessionFactory);  
	    }
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById",id);
		return user;
	}
	
}
