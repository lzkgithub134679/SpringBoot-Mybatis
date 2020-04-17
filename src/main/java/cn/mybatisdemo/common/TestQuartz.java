package cn.mybatisdemo.common;

import cn.mybatisdemo.login.entity.VO.AreaVO;
import cn.mybatisdemo.login.service.IndexService;
import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/16 16:15
 * @Modified : lizhikang@youngyedu.com, 2020/4/16
 */
@Component
public class TestQuartz {

    @Resource
    private IndexService indexService;
    //每5秒触发
    @Scheduled(cron = "*/1 * * * * ?")
    public void task(){
        List<AreaVO> areaList = indexService.listArea();
        System.out.println(areaList.get(0));
        System.out.println("定时任务:"+ DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
    }
}
