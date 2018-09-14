package org.csu.workmaster_v1.web;

import org.csu.workmaster_v1.Dao.UserDao;
import org.csu.workmaster_v1.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
   /* @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/registe")
    public Map<String, Object> registe (String studentId,String userpassword,String username){
        User user = userDao.findUserByusername(studentId);
        Map<String, Object> map = new HashMap<>();
        if(user!=null){
        }else{
            map.put("request Url", 4);
        }
        return map;
    }

    *//**
     * @Cacheable 支持如下几个参数：
     * value：缓存的名称。
     * key：缓存的 key，可以为空
     *  condition：触发条件，只有满足条件的情况才会加入缓存，默认为空 condition="#nickname.length() >= 6"
     *//*
    @GetMapping("/hello")
    @Cacheable(value="helloCache")
    public String hello(String name) {
        System.out.println("没有走缓存！"+name);
        return name+"server2";
    }
    //使用CachePut进行操作的时候，不管怎么样，都会将

    @RequestMapping(value = "/setSession")
    public Map<String, Object> setSession (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("message", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/getSession")
    public Object getSession (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("message"));
        return map;
    }
*/
}

