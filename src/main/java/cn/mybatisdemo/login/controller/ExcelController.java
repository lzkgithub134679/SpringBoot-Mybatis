package cn.mybatisdemo.login.controller;

import cn.mybatisdemo.common.ExtUtils;
import cn.mybatisdemo.login.entity.VO.AreaVO;
import cn.mybatisdemo.login.service.IndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController()
@RequestMapping()
public class ExcelController {

    @Resource
    private IndexService indexService;

    @GetMapping("/execl")
    public void export(HttpServletResponse response){
        List<AreaVO> areaList = indexService.listArea();
        ExtUtils.exportExcel(areaList,"easypoi导出功能","导出sheet1",AreaVO.class,"测试user.xls",response);
    }
}