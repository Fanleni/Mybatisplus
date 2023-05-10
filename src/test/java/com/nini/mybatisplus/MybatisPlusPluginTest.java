package com.nini.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nini.mybatisplus.mapper.Usermapper;
import com.nini.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author nini
 * @create 2022--10--27--21:55
 */
@SpringBootTest
public class MybatisPlusPluginTest {
    @Resource
    private Usermapper userMapper;

    @Test
    public void testPage(){
        Page<User> page=new Page<>(1,3);
        userMapper.selectPage(page,null);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }
    @Test
    public void testPageVo(){
        Page<User> page=new Page<>(1,3);
        userMapper.selectPageVo(page,20);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }
}
