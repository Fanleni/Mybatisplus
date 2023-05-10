package com.nini.mybatisplus;

import com.nini.mybatisplus.pojo.User;
import com.nini.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nini
 * @create 2022--10--18--9:32
 */
@SpringBootTest
public class MybatisPlusServiceTest {
    @Autowired
    private UserService userservice;
    @Test
    public void testGetCount(){
        long count=userservice.count();
        System.out.println("总记录数"+count);
    }
    @Test
    public void testInsertMore(){
        List<User> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            User user=new User();
            user.setUserName("nini"+i);
            user.setAge(30+i);
            list.add(user);
        }
        boolean b= userservice.saveBatch(list);
        System.out.println(b);
    }
}
