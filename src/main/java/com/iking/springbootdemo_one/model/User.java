package com.iking.springbootdemo_one.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@TableName("demo_user")//表明这个实体类对应数据库中的demo_user表
@Data//lombok
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
@ApiModel
public class User implements Serializable {


   // @TableId(type = IdType.AUTO)
   @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "用户真实姓名")
    private String name;
    @ApiModelProperty(value = "用户密码")
    @TableField(select = false)  //查询时不返回该字段的值
    private String password;
    @ApiModelProperty(value = "用户籍贯")
    private String address;
    @ApiModelProperty(value = "用户年龄")
    private Integer age;
    @TableField(update = "now()")
    @ApiModelProperty(value = "创建用户的时间")
    private Date createTime;
    @TableField(exist = false)  //数据库中不存在该字段
    private String alibaba;
    @TableField(value = "email") // 数据库中对应的字段是"email"
    @ApiModelProperty(value = "用户邮箱")
    private String mail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(address, user.address) &&
                Objects.equals(age, user.age) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(alibaba, user.alibaba) &&
                Objects.equals(mail, user.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, name, password, address, age, createTime, alibaba, mail);
    }
}
