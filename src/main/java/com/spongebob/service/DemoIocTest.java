package com.spongebob.service;


import com.spongebob.service.impl.UserImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Describe:
 * @Author Happy
 * @Create 2023/5/8-16:56
 **/
public class DemoIocTest {
    @Test
    public void testAdd() {
        /**
         * （1）BeanFactory：IOC容器基本实现，是Spring内部的使用接口，不提供开发人员进行使用
         * "加载配置文件时候不会创建对象"，在获取对象（使用）才去创建对象
         *
         * （2）ApplicationContext：BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员进行使用
         * 加载配置文件时候就会把在配置文件对象进行创建
         *
         * ClassPathXmlApplicationContext寻找的是工程相对路径
         * FileSystemXmlApplicationContext寻找的是磁盘绝对路径
         */
        
        
        //1 加载spring配置文件
        //BeanFactory context = new ClassPathXmlApplicationContext("./beans/ApplicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("./beans/ApplicationContext.xml");
        
        
        //2 获取配置创建的对象
        User user = context.getBean("user", UserImpl.class);
        System.out.println(user);
        user.add();
    }
}
