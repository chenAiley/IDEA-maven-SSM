# IDEA-maven-SSM
记录一下自己第一次学习ssm框架搭建的过程

首先连接数据库
1.在pom.xml中添加依赖包
2.配置web.xml
3.配置spring的配置文件applicationContext.xml
4.jdbc.properties
5.config.xml
6.写实体类与接口，User.java，
7.IUserDao.java，mybatis映射文件IUserDao.xml
以上步骤后（其中关于spring-mvc的配置可先注释掉），mybatis与spring整合完毕，可以写测试类test测试是否整合成功，成功如下图所示：
![image](https://github.com/chenAiley/IDEA-maven-SSM/blob/master/1.jpg)
8.测试成功后，开始整合spring-mvc，配置spring-mvc.xml
9.写userservice.java，和userserviceimpl.java
10.最后写控制层代码usercontroller.java
结束！
