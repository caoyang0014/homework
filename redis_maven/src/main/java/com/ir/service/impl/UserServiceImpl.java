package com.ir.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ir.bean.User;
import com.ir.dao.IUserDao;
import com.ir.service.IUserService;
import com.ir.util.RedisUtil;

/**
 *@author 曹洋
 *2017年7月10日 上午11:23:19
 *
 *
 *
 */

@Service("userService")

public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao dao;
	
	private RedisUtil redisUtil;
	
	
	/* 
	 * @method
	 * @author 曹洋
	 * @时间 2017年7月10日 下午3:31:58
	 *  
	 */
	public List<User> getList() {
		// TODO Auto-generated method stub
		List<User> list = dao.getList();
		for (User user : list) {
			redisUtil.set("userid", "user.getId()");
			redisUtil.set("username", "user.getUsername()");
			redisUtil.set("userpass", "user.getPassword()");
			redisUtil.set("userage", "user.getAge()");
		}
		return list;
	}

}
