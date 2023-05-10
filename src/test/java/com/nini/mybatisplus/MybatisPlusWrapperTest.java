package com.nini.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.nini.mybatisplus.mapper.Usermapper;
import com.nini.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nini
 * @create 2022--10--27--21:26
 */
public class MybatisPlusWrapperTest {
    @Resource
    Usermapper usermapper;
    @Test
    public void test1(){
        String username="a";
        Integer ageBegin=null;
        Integer ageEnd=30;
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.like(StringUtils.isNotBlank(username),"user_name",username)
                .ge(ageBegin!=null,"age",ageBegin)
                .le(ageEnd!=null,"age",ageEnd);
        List<User> list= usermapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
    @Test
    public void test2(){
        String username="a";
        Integer ageBegin=null;
        Integer ageEnd=30;
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(username),User::getUserName,username)
                .ge(ageBegin!=null,User::getAge,ageBegin)
                .le(ageEnd!=null,User::getAge,ageEnd);
        List<User> list= usermapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
    @Test
    public void test3(){
        LambdaUpdateWrapper<User> updateWrapper=new LambdaUpdateWrapper<>();
        updateWrapper.like(User::getUserName,"a").and(i->i.gt(User::getAge,20).or()
                .isNull(User::getEmail));
        updateWrapper.set(User::getUserName,"nini").set(User::getEmail,"1332446345@qq.com");
        int result=usermapper.update(null,updateWrapper);
        System.out.println(result);
    }
}
