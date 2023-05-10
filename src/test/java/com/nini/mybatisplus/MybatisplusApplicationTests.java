package com.nini.mybatisplus;

import com.nini.mybatisplus.mapper.Usermapper;
import com.nini.mybatisplus.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
@Slf4j
@SpringBootTest
class MybatisplusApplicationTests {
    @Autowired
    private Usermapper usermapper;
    @Test
    public void testSelectList(){
        log.info("hello");
        //通过条件构造器查询一个list,若没有条件，则可以设置Null为参数
        List<User> list=usermapper.selectList(null);
        list.forEach(System.out::println);
    }
    @Test
    public void testInsert(){
        User user=new User();
        user.setUserName("nini");
        user.setAge(18);
        user.setEmail("1312446345@qq.com");
        int result= usermapper.insert(user);
        System.out.println("result "+result);
        System.out.println("id "+user.getUid());// id 1581850651748540418 采用雪花算法
    }
    @Test
    public void testDelete(){
//        int result= usermapper.deleteById(1581850651748540418L);
//        System.out.println("result="+result);
//          Map<String,Object> map=new HashMap<>();
//          map.put("name","nini");
//          map.put("age",18);
//        int result=usermapper.deleteByMap(map);
        Collection col=Arrays.asList(2L,1L);
        usermapper.deleteBatchIds(col);
    }
    @Test
    public void testUpdate(){
        User user=new User();
        user.setUid(3l);
        user.setUserName("dd");
        user.setEmail("1332446451@qq.com");
        int result=usermapper.updateById(user);
        System.out.println(result);

    }
    @Test
    public void testSelect(){
//        User user= usermapper.selectById(1L);
//        System.out.println(user);
//        List<Long> list=Arrays.asList(1L,2L,3L);
//        List<User> users=usermapper.selectBatchIds(list);
//        users.forEach(System.out::println);
//        List<User> ur=usermapper.selectList(null);
//        System.out.println(ur);
        Map<String,Object> map=usermapper.selectMapById(1L);
        System.out.println(map);
    }

}
