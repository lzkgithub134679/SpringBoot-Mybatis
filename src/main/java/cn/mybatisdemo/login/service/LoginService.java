package cn.mybatisdemo.login.service;

import cn.mybatisdemo.login.entity.User;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/16 11:12
 * @Modified : lizhikang@youngyedu.com, 2020/4/16
 */
public interface LoginService {

    /**
     * @Description : 查询用户信息
     * @Author : lizhikang@youngyedu.com, 2020年04月16日 11:13:25
     * @Modified : lizhikang@youngyedu.com, 2020年04月16日
     * @param name
     * @return cn.mybatisdemo.login.entity.User
     */
    User getUserByName(String name);

    void findRoleAndPermissions(User user);
}
