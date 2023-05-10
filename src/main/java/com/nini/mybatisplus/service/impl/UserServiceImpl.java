package com.nini.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nini.mybatisplus.pojo.User;
import com.nini.mybatisplus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import com.nini.mybatisplus.mapper.Usermapper;

/**
 * @author nini
 * @create 2022--10--18--9:26
 */
@Slf4j
@Repository
public class UserServiceImpl extends ServiceImpl<Usermapper,User> implements UserService{

}
