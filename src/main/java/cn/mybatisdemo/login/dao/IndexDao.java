package cn.mybatisdemo.login.dao;

import cn.mybatisdemo.login.entity.DTO.AreaDTO;

import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:43
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
public interface IndexDao {
    List<AreaDTO> listArea();
}
