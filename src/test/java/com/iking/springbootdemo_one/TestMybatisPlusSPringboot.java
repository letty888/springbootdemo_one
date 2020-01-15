package com.iking.springbootdemo_one;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iking.springbootdemo_one.mapper.UserMapper;
import com.iking.springbootdemo_one.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class TestMybatisPlusSPringboot {

    @Autowired
    private UserMapper userMapper;


    /**
     * 新增
     */
    @Test
    void insertTest() {
        User userEntity = new User();
        //userEntity.setId(1);
        userEntity.setUserName("tangseng");
        userEntity.setAddress("东土大唐33333");
        userEntity.setAge(66);
        userEntity.setName("唐僧33333");
        userEntity.setCreateTime(new Date());
        userEntity.setPassword("666666");
        userEntity.setMail("111222333@qq.com");
        int result = userMapper.insert(userEntity);
        System.out.println("影响的行数是:" + result);
        System.out.println("插入数据库后的id值为:" + userEntity.getId());
    }

    /**
     * 查询
     */
    @Test
    public void selectTest() {
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }


    /**
     * selectPage
     */
    @Test
    public void selectPage(){
        //相当于查询条件为空,即查询所有
        Page<User> page = new Page();
        page.setCurrent(1);
        page.setSize(5);
        Page<User> userPage = userMapper.selectPage(page, null);
        List<User> userList = userPage.getRecords();
        for (User user : userList) {
            System.out.println("userPage.getRecords(); ---> "+ user);
        }

        List<OrderItem> orders = userPage.getOrders();
        for (OrderItem order : orders) {
            System.out.println(" userPage.getOrders() ---> "+ order);
        }
    }

    /**
     * updateById修改
     */
    @Test
    public void updateByIdTest() {
        User user = new User();
        user.setId(7);
        user.setName("呼延大藏");
        user.setMail("222@qq.com");
        userMapper.updateById(user);
    }


    /**
     * update+QueryWrapper进行更新
     */
    @Test
    public void updateAndQueryWrapper() {
    //将要进行修改的内容
        User user = new User();
        user.setAddress("天蓬");
    //更改对象的条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //注意:这里的第一个参数一定和数据库字段值一样
        queryWrapper.eq("user_name", "zhubajie");
        userMapper.update(user, queryWrapper);
    }


    /**
     * update+updateWrapper进行更新
     */
    @Test
    public void updateAndUpdateWrapper() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("user_name", "齐天大圣").set("name", "齐天大圣孙悟空").eq("id", 3);
        userMapper.update(null, updateWrapper);
    }


    /**
     * deleteById删除
     */
    @Test
    public void deleteByIdTest(){
        int i = userMapper.deleteById(9);
        System.out.println(i);
    }

    /**
     * deleteByMap
     */
    @Test
    public void deleteByMapTest(){
        Map<String, Object> map = new HashMap<>();
        map.put("user_name","liababa");
        map.put("password","bbbb");
        //根据map删除数据,多条件之间是and的关系
        int i = userMapper.deleteByMap(map);
        System.out.println(i);
    }


    /**
     * delete+querywrapper
     */
    @Test
    public void deleteAndQueryWrapper(){
        //用法一:需要手动设置字段名
       /* QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name","liababaa");
        int result = userMapper.delete(queryWrapper);
        System.out.println("返回的影响行数是:"+result);*/


       //用法二:面向对象的思想,推荐使用这一种
        User user = new User();
        user.setUserName("liababaa");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
        int result = userMapper.delete(queryWrapper);
        System.out.println("返回的影响行数是:"+result);
    }


    /**
     * deleteBatchIds
     */
    @Test
    public void deleteBatchIdsTest(){
        ArrayList idList = new ArrayList<Integer>();
        idList.add(10);
        idList.add(11);
        userMapper.deleteBatchIds(idList);
    }


    /**
     * 模糊查询
     */
    @Test
    public void LikeSelectTest(){
        QueryWrapper<User> query = new QueryWrapper<>();
        query.likeRight("user_name","齐天");
        List<User> users = userMapper.selectList(query);
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 排序查询
     */
    @Test
    public void orderSelect(){
        QueryWrapper<User> query = new QueryWrapper<>();
        query.orderByAsc("age");
        List<User> users = userMapper.selectList(query);
        for (User user : users) {
            System.out.println(user);
        }
    }


    /**
     * OrSelect
     */
    @Test
    public void OrSelectTest(){
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.like("name","齐天大圣").or().eq("age",66);
        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }


    /**
     * SelectSpecialize查询指定的字段
     */
    @Test
    public void SelectSpecializeTest(){
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.like("name","齐天大圣").or().eq("age",66).select("age","name","user_name");
        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
