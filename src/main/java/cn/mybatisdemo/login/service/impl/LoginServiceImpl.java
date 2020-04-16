package cn.mybatisdemo.login.service.impl;

import cn.mybatisdemo.login.dao.LoginDao;
import cn.mybatisdemo.login.entity.User;
import cn.mybatisdemo.login.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/16 11:12
 * @Modified : lizhikang@youngyedu.com, 2020/4/16
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public User getUserByName(String name) {
        User userByName = loginDao.getUserByName(name);
        return userByName;
    }

    @Override
    public void findRoleAndPermissions(User user) {

    }
}
