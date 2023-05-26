package com.spongebob.aop;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Describe:
 * @Author Happy
 * @Create 2023/5/7-23:25
 **/
public class AopTest {
    
    @Test
    public void testInsert_withContextXML(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("./beans/ApplicationContext.xml");
        //BeanFactory context=new ClassPathXmlApplicationContext("./beans/ApplicationContext.xml");
        UserService userService=context.getBean(UserService.class);
        userService.insert();
    }
    
    
    @Test
    public void testInsert_withAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);
        userService.insert();
    }
}
