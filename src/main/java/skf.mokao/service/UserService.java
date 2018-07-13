package skf.mokao.service;

import skf.mokao.model.User;

public interface UserService {
    //用户登陆
    public boolean login(String username,String password);
    //用户注册
    public boolean register(User user);
}
