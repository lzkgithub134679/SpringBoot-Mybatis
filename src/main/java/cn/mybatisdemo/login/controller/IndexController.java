package cn.mybatisdemo.login.controller;

import cn.mybatisdemo.login.entity.VO.AreaVO;
import cn.mybatisdemo.login.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/8 10:45
 * @Modified : lizhikang@youngyedu.com, 2020/4/8
 */
@Controller()
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
    @GetMapping("/jdbc")
    public String jdbcIndex(Model model){
        List<AreaVO> areaList = indexService.listArea();
        model.addAttribute("title","jdbc地区");
        model.addAttribute("areaList",areaList);
        return "index";
    }

    /**
     * @Description : 使用mybatis访问数据库
     * @Author : lizhikang@youngyedu.com, 2020年04月08日 11:47:38
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     * @return
     */
    @GetMapping("/mybatis")
    public String mybatisIndex(Model model){
        List<AreaVO> areaList = indexService.listAreaMybatis();
        model.addAttribute("title","mybatis地区");
        model.addAttribute("areaList",areaList);
        return "index";
    }

    /**
     * @Description : TODO
     * @Author : lizhikang@youngyedu.com, 2020年04月08日 16:45:08
     * @Modified : lizhikang@youngyedu.com, 2020年04月08日
     */
    @GetMapping("/json")
    @ResponseBody
    public AreaVO indexJson(){
        AreaVO areaList = indexService.listAreaJson();
        return areaList;
    }
}
