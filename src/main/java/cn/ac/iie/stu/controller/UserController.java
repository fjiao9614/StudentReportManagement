package cn.ac.iie.stu.controller;

import cn.ac.iie.stu.domain.User;
import cn.ac.iie.stu.mapper.UserMapper;
import cn.ac.iie.stu.service.UserService;
import cn.ac.iie.stu.utils.ReturnFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户操作相关控制器
 *
 * @author fjiao
 * @date 2019/03/10 10:55
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userService;
    //private UserService userService;

    /**
     * 用户登录
     */
    @PostMapping(value = "/_login", produces = "application/json;charset=UTF-8")
    public String login(@RequestParam("stu_id")String user_id, @RequestParam("passwd")String passwd, HttpServletRequest httpServletRequest){
        try{
            Long userID = userService.login(user_id,passwd);
            if(userID != null){
                httpServletRequest.getSession().setAttribute("user_id",userID);
                System.out.println("登录的用户id为："+userID);
                return ReturnFormat.result(userID,"登录成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return ReturnFormat.failed("登录失败");
    }

    /**
     * 根据旧密码修改密码
     */
    @PostMapping(value = "/_changepwd", produces = "application/json;charset=UTF-8")
    public String setPasswd(@RequestParam("user_id") Long user_id,@RequestParam("old_passwd")String old_passwd, @RequestParam("new_passwd") String new_passwd){
        System.out.println("后台修改密码：user_id："+user_id+" 旧密码："+old_passwd + " 新密码："+new_passwd);
        try {
            userService.changePasswd(user_id,old_passwd,new_passwd);

        } catch (Exception e) {
            e.printStackTrace();
            return ReturnFormat.failed(e.getMessage());
        }
        return ReturnFormat.success("修改密码成功");
    }
}
