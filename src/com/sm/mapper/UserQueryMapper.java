package com.sm.mapper;

import com.sm.po.User;
/**
 * mapper的动态代理(该代理的配置xml文件必须和这个接口放在同一个包下，且名称完全一样)
 * @author liyang
 *
 */
public interface UserQueryMapper {
	public User findUserById(int id) throws Exception;
}
