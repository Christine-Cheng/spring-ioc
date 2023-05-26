package com.spongebob.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Describe:
 * @Author Happy
 * @Create 2023/5/8-0:15
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spongebob")
public class Config {
}
