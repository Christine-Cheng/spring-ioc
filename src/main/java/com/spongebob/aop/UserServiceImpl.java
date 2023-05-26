package com.spongebob.aop;

import org.springframework.stereotype.Service;

/**
 * @Describe:
 * @Author Happy
 * @Create 2023/5/7-23:17
 **/
@Service
public class UserServiceImpl implements UserService {
    
    @Override
    public void insert() {
        System.out.println("调用了dao层的insert()");
    }
    
}
