package com.cn.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.test.dao.IUserDao;
import com.cn.test.pojo.User;
import com.cn.test.service.IUserService;
@Service("userService")
public class IUserServiceImple implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
