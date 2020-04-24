package cn.mybatisdemo.login.entity.VO;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:50
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Data
public class AreaVO  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Excel(name = "id", width = 15)
    private Integer areaId;

    @Excel(name = "areaLevel", width = 15)
    private Integer areaLevel;

    @Excel(name = "areaName", width = 15)
    private String areaName;

    @Excel(name = "areaParent", width = 15)
    private Integer areaParent;

    /** area_id */
    private List<AreaVO> areaNodes;
}
