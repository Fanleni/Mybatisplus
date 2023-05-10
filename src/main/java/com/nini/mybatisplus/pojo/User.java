package com.nini.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @author nini
 * @create 2022--10--17--10:46
 */
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("t_user")
public class User {
    @TableId(value="uid",type= IdType.AUTO)
    private Long uid;
    private String userName;
    private Integer age;
    private String email;

}
