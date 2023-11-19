package com.spongebob.service;

/**
 * @Describe: 简述工厂模式
 * @Author Happy
 * @Create 2023-10-18 00:19:29
 **/
public class DemoFactory01 {
    
    public static void main(String[] args) {
        UserService userService =new UserService();
        userService.execute();
    
        UserService1 userService1 = new UserService1();
        userService1.execute();
    }

}

/**
 * 原始方式 耦合度太高
 */
class UserDao{
    void add(){
        
        System.out.println("原始方式 添加用户");
    }
    
}
class UserService {
    void execute(){
        UserDao userDao=new UserDao();
        
        userDao.add();
        
    }
}

/**
 * 工厂模式
 * 通过工厂类去实例化调用的对象
 */
class UserDao1{
    void add(){
        System.out.println("工厂模式 添加用户");
    }
    
}
class UserService1 {
    void execute(){
        UserDao1 userDao = UserFactory.getUserDao();
        userDao.add();
    
    }
}
class UserFactory{
    static UserDao1 getUserDao() {
        return new UserDao1();
    }
}
