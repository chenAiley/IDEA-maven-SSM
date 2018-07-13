package skf.mokao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import skf.mokao.dao.IUserDao;
import skf.mokao.model.User;

//@Service("UserService") 注解用于标示此类为业务层组件,在使用时会被注解的类会自动由
//spring进行注入,无需我们创建实例
@Service("UserService")
public class userserviceimpl implements UserService{
    //自动注入iuserdao 用于访问数据库
    @Autowired
    IUserDao Mapper;

    //登录方法的实现,从jsp页面获取username与password
    public boolean login(String username, String password) {
        //System.out.println("加密前:" + password);

        //spring自带的工具DigestUtils实现md5加密
        password=DigestUtils.md5DigestAsHex(password.getBytes());

        //System.out.println("加密后:" + password);
        //对输入账号进行查询,取出数据库中保存对信息
        User user;
        if (Mapper.selectByName(username) != null) {
            user = Mapper.selectByName(username);
            if (user.getUsername().equals(username)&& user.getPassword().equals(password)) {
                return true;
            }
        }
        else if(Mapper.selectByMobile(username)!=null){
            //System.out.println("根据手机");
            user=Mapper.selectByMobile(username);
            if (user.getMobile().equals(username)&& user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        if (Mapper.selectByMobile(user.getMobile()) == null) {

            user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
            Mapper.addUser(user);
            return true;
        }
        else{
            return false;
        }

    }
}
