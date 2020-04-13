package cn.mybatisdemo.login.entity.DTO;

import cn.mybatisdemo.login.entity.VO.AreaVO;
import lombok.Data;

import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:53
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Data
public class AreaDTO {

    /** area_id */
    private Integer areaId;

    /** area_level */
    private Integer areaLevel;

    /** area_name */
    private String areaName;

    /** area_parent */
    private Integer areaParent;

    private List<AreaVO> areaNodes;
}
