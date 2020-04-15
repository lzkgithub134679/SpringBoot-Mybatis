package cn.mybatisdemo.login.controller;

import cn.mybatisdemo.login.entity.VO.AreaVO;
import cn.mybatisdemo.login.service.IndexService;
import io.swagger.annotations.ApiOperation;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description : 测试controller
 * @Author : lizhikang@youngyedu.com, 2020/4/8 10:45
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Resource
    private IndexService indexService;

    /**
     * @Description : 使用jdbctemplete访问数据库
     * @Author : lizhikang@youngyedu.com, 2020年04月08日 11:47:22
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     * @param
     * @return java.lang.String
     */
    @ApiOperation(value="jdbc获取地区列表", notes="jdbc获取地区列表")
    @GetMapping("/jdbc")
    public String jdbcIndex(Model model){
        List<AreaVO> areaList = indexService.listArea();
        model.addAttribute("title","jdbc地区");
        model.addAttribute("areaList",areaList);
        return "index";
    }

    /**
     * @Description : 使用mybatis访问数据库
     * @Author : lizhikang@yo整个ungyedu.com, 2020年04月08日 11:47:38
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     * @return
     */
    @ApiOperation(value="mybatis获取地区列表", notes="mybatis获取地区列表")
    @GetMapping("/mybatis")
    public String mybatisIndex(Model model){
        List<AreaVO> areaList = indexService.listAreaMybatis();
        model.addAttribute("title","mybatis地区");
        model.addAttribute("areaList",areaList);
        return "index";
    }

    // 计算7天后的时间和传入的比较
    public static Boolean compareCurrentDate(String time){
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime parse = DateTime.parse(time, format);
        DateTime dateTime = parse.plusDays(7);
        DateTime now = DateTime.now();
        return dateTime.isAfter(now);
    }
}
