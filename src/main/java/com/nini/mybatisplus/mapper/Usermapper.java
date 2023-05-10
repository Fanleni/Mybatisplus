package com.nini.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nini.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author nini
 * @create 2022--10--17--10:50
 */
@Repository
public interface Usermapper extends BaseMapper<User> {
    Map<String,Object> selectMapById(Long id);

    /**
     *
     * @param page 必须位于第一个位置
     * @param age
     * @return
     */
    Page<User> selectPageVo(@Param("page") Page<User> page,@Param("age") Integer age);
}
