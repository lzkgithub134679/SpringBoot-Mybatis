package cn.mybatisdemo.login.service;

import cn.mybatisdemo.login.entity.VO.AreaVO;

import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:42
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
public interface IndexService {
    /**
     * @Description : 查询地区(jdbc)
     * @Author : lizhikang@youngyedu.com, 2020年04月08日 11:51:51
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     * @param
     * @return java.util.List<cn.mybatisdemo.login.entity.VO.AreaVO>
     */
    List<AreaVO> listArea();

    /**
     * @Description :查询地区(mybatis)
     * @Author : lizhikang@youngyedu.com, 2020年04月08日 14:40:53
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     * @param
     * @return java.util.List<cn.mybatisdemo.login.entity.VO.AreaVO>
     */
    List<AreaVO> listAreaMybatis();

}
