package cn.mybatisdemo.login.dao.impl;

import cn.mybatisdemo.login.dao.LoginDao;
import cn.mybatisdemo.login.entity.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/16 11:17
 * @Modified : lizhikang@youngyedu.com, 2020/4/16
 */
@Repository
public class LoginDaoImpl extends BaseDao implements LoginDao {


    @Override
    public User getUserByName(String name) {
        String sql = " SELECT id,username AS userName,password AS userPassword from  user where username = ?";
        Object [] obj = new Object[]{name};
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), obj);
        return userList.size()>0 ?userList.get(0) : null;

    }
}
