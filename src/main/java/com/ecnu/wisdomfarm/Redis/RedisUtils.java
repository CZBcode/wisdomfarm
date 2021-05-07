package com.ecnu.wisdomfarm.Redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisUtils
 * @Description
 * @Author Lizhou
 * @Date 2020-10-22 10:10:10
 **/
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 根据key读取数据
     */
    public Object get(final String key) {
        if ("".equals(key)) {
            return null;
        }
        try {
            return redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 写入数据
     */
    public boolean set(final String key, Object value) {
        if ("".equals(key)) {
            return false;
        }
        try {
            redisTemplate.opsForValue().set(key, value);
            System.out.println("存入redis成功，key：{}，value：{}"+key+value);
            return true;
        } catch (Exception e) {
            System.out.println("存入redis失败，key：{}，value：{}"+key+value);
            e.printStackTrace();
        }
        return false;
    }
}

