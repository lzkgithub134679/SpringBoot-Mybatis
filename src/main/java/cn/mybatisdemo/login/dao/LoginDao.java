package cn.mybatisdemo.login.dao;

import cn.mybatisdemo.login.entity.User;

public interface LoginDao {

    /**
     * @Description : TODO
     * @Author : lizhikang@youngyedu.com, 2020年04月16日 11:19:04
     * @Modified : lizhikang@youngyedu.com, 2020年04月16日
     * @param name
     * @return cn.mybatisdemo.login.entity.User
     */
    User getUserByName(String name);
}
