package skf.mokao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import skf.mokao.dao.IUserDao;
import skf.mokao.model.User;

public class test {
    private static ApplicationContext ac;
    static {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static void main(String[] args) {
        IUserDao mapper = (IUserDao) ac.getBean("IUserDao");
        System.out.println("获取username");
        User user = mapper.selectByName("Ailey");

        System.out.println(user.getId()+":"+"username:"+user.getUsername());
        System.out.println("password:"+user.getPassword());

    }
}
