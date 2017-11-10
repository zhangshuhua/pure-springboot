package com.cetiti.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by zsh7040 on 2017-11-9.
 */
@Component
public class AnotherServieceImpl implements CommonService {
    @Override
    public void hello() {
        System.out.println("AnotherServieceImpl");
    }
}
