package cn.mybatisdemo.login.entity.VO;

import lombok.Data;

import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:50
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Data
public class AreaVO {
    /** area_id */
    private Integer areaId;

    /** area_level */
    private Integer areaLevel;

    /** area_name */
    private String areaName;

    /** area_parent */
    private Integer areaParent;

    /** area_id */
    private List<AreaVO> areaNodes;
}
