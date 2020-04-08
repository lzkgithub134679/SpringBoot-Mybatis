package cn.mybatisdemo.login.mapper;

import cn.mybatisdemo.login.entity.DTO.AreaDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description : TODO
 * @Author : lizhikang@youngyedu.com, 2020年04月08日 14:44:11
 * @Modified : lizhikang@youngyedu.com, 2020年04月08日
 */
@Mapper
public interface IndexMapper {

    /**
     * @Description : 查询地区(mybaits)
     * @Author : lizhikang@youngyedu.com, 2020年04月08日 14:45:03
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     * @param
     * @return java.util.List<cn.mybatisdemo.login.entity.DTO.AreaDTO>
     */
    List<AreaDTO> listAreaMybatis();
}
