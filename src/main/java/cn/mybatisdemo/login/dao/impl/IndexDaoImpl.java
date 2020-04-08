package cn.mybatisdemo.login.dao.impl;

import cn.mybatisdemo.login.dao.IndexDao;
import cn.mybatisdemo.login.entity.DTO.AreaDTO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:43
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Repository("indexDao")
public class IndexDaoImpl extends BaseDao implements IndexDao {
    @Override
    public List<AreaDTO> listArea() {
        String sql = "SELECT area_id AS areaId,area_level AS areaLevel,area_name AS areaName," +
                " area_parent AS areaParent FROM areas";
        List<AreaDTO> areaDTOS = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AreaDTO.class));
        return areaDTOS;
    }
}
