package com.ir.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ir.util.RedisUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 *@author 曹洋
 *2017年7月10日 上午10:29:04
 *
 *
 *
 */
@Service("redisTemplate")
public class RedisTest {

	JedisPool pool;
    Jedis jedis; 
    @Autowired
    private RedisUtil redisUtil;
    
    
	@Test
	public void redis(){
	    
		redisUtil.set("name", "1234567");
	    System.out.println(redisUtil.get("id"));
	      
	      
	}
}
