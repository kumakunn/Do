package org.csu.workmaster_v1.redisTest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisTemplate {
    @Autowired
    private RedisTemplate redisTemplate;
    /*
    使用redis存取String测试通过
    public void testString()  {
        redisTemplate.opsForValue().set("neo", "ityouknow");
        Assert.assertEquals("ityouknow", redisTemplate.opsForValue().get("neo"));
    }

     使用redis存取对象，测试通过
     public void testPojo()  {
         User user=new User("shuxin", "shuxin123", "youknow");
         ValueOperations<String, User> operations=redisTemplate.opsForValue();
         operations.set("com.neo", user);使用("expire", user,100,TimeUnit.MILLISECONDS)这样的方式进行超时的设置
         User u=operations.get("com.neo");
         System.out.println("user: "+u.toString());
     }*/

    /*
    //使用Hash进行操作
    @Test
    public void testHash(){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.put("hash","you","you");
        String value=(String) hash.get("hash","you");
        System.out.println("hash value :"+value);
    }
    //使用队列进行操作
    @Test
    public void testList() {
        ListOperations<String, String> list = redisTemplate.opsForList();
        list.leftPush("list","it");
        list.leftPush("list","you");
        list.leftPush("list","know");
        String value=(String)list.leftPop("list");
        System.out.println("list value :"+value.toString());
    }

    //队列的范围取值，对前两个进行取值
    List<String> values=list.range("list",0,2);
       for (String v:values){
           System.out.println("list range :"+v);
       }

     //使用set进行数据的存储
     @Test
    public void testSet() {
        String key="set";
        SetOperations<String, String> set = redisTemplate.opsForSet();
        set.add(key,"it");
        set.add(key,"you");
        set.add(key,"you");
        set.add(key,"know");
        Set<String> values=set.members(key);
        for (String v:values){
            System.out.println("set value :"+v);
        }
    }
    */


}