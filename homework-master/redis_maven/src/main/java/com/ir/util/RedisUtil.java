package com.ir.util;

import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *@author ����
 *2017��7��10�� ����10:17:06
 *
 *
 *
 */
@Service
public class RedisUtil {

	private Logger logger = Logger.getLogger(RedisUtil.class); 
	@Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;  
	
	public void setSpringDao(RedisTemplate redisTemplate) {  
        this.redisTemplate = redisTemplate;  
    }
    /** 
     * ����ɾ����Ӧ��value 
     *  
     * @param keys 
     */  
    public void remove(final String... keys) {  
        for (String key : keys) {  
            remove(key);  
        }  
    }  
  
    /** 
     * ����ɾ��key 
     *  
     * @param pattern 
     */  
    public void removePattern(final String pattern) {  
        Set<Serializable> keys = redisTemplate.keys(pattern);  
        if (keys.size() > 0)  
            redisTemplate.delete(keys);  
    }  
  
    /** 
     * ɾ����Ӧ��value 
     *  
     * @param key 
     */  
    public void remove(final String key) {  
        if (exists(key)) {  
            redisTemplate.delete(key);  
        }  
    }  
  
    /** 
     * �жϻ������Ƿ��ж�Ӧ��value 
     *  
     * @param key 
     * @return 
     */  
    public boolean exists(final String key) {  
        return redisTemplate.hasKey(key);  
    }  
  
    /** 
     * ��ȡ���� 
     *  
     * @param key 
     * @return 
     */  
    public Object get(final String key) {  
        Object result = null;  
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();  
                  
        result = operations.get(key);  
        return result;  
    }  
  
    /** 
     * д�뻺�� 
     *  
     * @param key 
     * @param value 
     * @return 
     */  
    public boolean set(final String key, Object value) {  
        boolean result = false;  
        try {  
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();  
                      
            operations.set(key, value);  
            result = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
  
    /** 
     * д�뻺�� 
     *  
     * @param key 
     * @param value 
     * @return 
     */  
    public boolean set(final String key, Object value, Long expireTime) {  
        boolean result = false;  
        try {  
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();  
                      
            operations.set(key, value);  
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);  
            result = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
  
    public void setRedisTemplate(  
            RedisTemplate<Serializable, Object> redisTemplate) {  
        this.redisTemplate = redisTemplate;  
    }
}
