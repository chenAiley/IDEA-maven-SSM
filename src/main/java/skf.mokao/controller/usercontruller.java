package skf.mokao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import skf.mokao.model.User;
import skf.mokao.service.UserService;

import javax.servlet.http.HttpServletRequest;

//@Controller注解用于标示本类为web层控制组件
@Controller
//@RequestMapping("/user")用于标定访问时对url位置
@RequestMapping("/")
//在默认情况下springmvc的实例都是单例模式,所以使用scope域将其注解为每次都创建一个新的实例
@Scope("prototype")
public class usercontruller {
    /**
     * ssm框架实现注册登录
     * */
    //自动注入业务层的userService类
    @Autowired
    UserService userService;

    //login业务的访问位置为/user/login
    @RequestMapping("/Login")
    public String login(User user, HttpServletRequest request){
        //System.out.println("h1");
        //调用login方法来验证是否是注册用户
        boolean login_nameType = userService.login(user.getUsername(),user.getPassword());
        boolean login_mobileType=userService.login(user.getMobile(),user.getPassword());
        if(login_nameType||login_mobileType){
            //如果验证通过,则将用户信息传到前台
            request.setAttribute("user",user);
            //并跳转到success.jsp页面
            return "success";
        }else{
            //若不对,则将错误信息显示到错误页面
            request.setAttribute("message","用户名密码错误");
            return "error";
        }
    }

    @RequestMapping("/register")
    public String register(User user, HttpServletRequest request){
        System.out.println("hhh");
        boolean registerType=userService.register(user);
        if(registerType){
            request.setAttribute("user",user);
            return "register_success";
        }
        else{
            request.setAttribute("message","该手机号已经注册！");
            return "error";
        }
    }
}
