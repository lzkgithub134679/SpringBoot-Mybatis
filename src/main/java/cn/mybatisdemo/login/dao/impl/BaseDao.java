package cn.mybatisdemo.login.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:44
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
public class BaseDao {

    @Resource
    protected JdbcTemplate jdbcTemplate;

    @Resource
    protected NamedParameterJdbcTemplate npJdbcTemplate;
}
