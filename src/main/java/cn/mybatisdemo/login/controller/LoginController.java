package cn.mybatisdemo.login.controller;

import cn.mybatisdemo.login.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * @Description : 登录Controller
 * @Author : lizhikang@youngyedu.com, 2020/4/16 11:09
 * @Modified : lizhikang@youngyedu.com, 2020/4/16
 */
@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/login")
    public String login(User user,Model model) {
        if(StringUtils.isEmpty(user.getUserName()) || user.getUserPassword() == null){
            return "login";
        }
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getUserName(),
                user.getUserPassword()
        );
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);
//            subject.checkRole("admin");
//            subject.checkPermissions("query", "add");
        } catch (AuthenticationException e) {
            model.addAttribute("msg","账号或密码错误！");
            logger.info("账号或密码错误！");
            return "login";
        } catch (AuthorizationException e) {
            model.addAttribute("msg","没有权限！");
            logger.info("没有权限！");
            return "login";
        }
        return "redirect:/index/jdbc";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        SecurityUtils.getSubject().getSession().removeAttribute(SecurityUtils.getSubject().getSession().getId());
        return "login";
    }
}
