package co.qf;

import org.junit.Before;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Redis {
@Test
public void redis1(){
    Jedis jedis = new Jedis("127.0.0.1", 6379);
    jedis.set("name", "里斯");
    System.out.println(jedis.get("name"));
}
    @Test
    public void inti() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        JedisPool jedisPool = (JedisPool) ac.getBean("jedisPool");
        Jedis jedis = jedisPool.getResource();
        jedis.set("name","张三");
        String name = jedis.get("name");
        System.out.println(name);
    }
}