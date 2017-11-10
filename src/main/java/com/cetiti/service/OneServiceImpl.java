package com.cetiti.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by zsh7040 on 2017-11-9.
 */
@Component
public class OneServiceImpl implements CommonService {
    @Override
    public void hello() {
        System.out.println("OneServiceImpl");
    }
}
