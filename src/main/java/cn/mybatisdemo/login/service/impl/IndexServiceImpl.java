package cn.mybatisdemo.login.service.impl;

import cn.mybatisdemo.login.dao.IndexDao;
import cn.mybatisdemo.login.entity.DTO.AreaDTO;
import cn.mybatisdemo.login.entity.VO.AreaVO;
import cn.mybatisdemo.login.mapper.IndexMapper;
import cn.mybatisdemo.login.service.IndexService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 11:42
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

    @Resource
    private IndexDao indexDao;

    @Resource
    private IndexMapper indexMapper;

    @Override
    public List<AreaVO> listArea() {
        List<AreaDTO> areaList = indexDao.listArea();
        List<AreaVO> areaVOList = areaList.stream().map(this::transferAreaDTO2AreaVO).collect(Collectors.toList());
        return areaVOList;
    }

    @Override
    public List<AreaVO> listAreaMybatis() {
        List<AreaDTO> areaList = indexMapper.listAreaMybatis();
        List<AreaVO> areaVOList = areaList.stream().map(this::transferAreaDTO2AreaVO).collect(Collectors.toList());
        return areaVOList;
    }

    private AreaVO transferAreaDTO2AreaVO(AreaDTO areaDTO) {
        AreaVO areaVO = new AreaVO();
        BeanUtils.copyProperties(areaDTO,areaVO);
        return areaVO;
    }
}
