package com.ir.test;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

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
public class RedisTest {

	JedisPool pool;
    Jedis jedis; 
    private static RedisUtil redisUtil;
    
    
	@Test
	public void redis(){
	    
		redisUtil.set("name", "1234567");
	    System.out.println(redisUtil.get("id"));
	      
	      
	}
}
