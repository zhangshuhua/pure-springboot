package com.cetiti.config;

import com.cetiti.service.AnotherServieceImpl;
import com.cetiti.service.CommonService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zsh7040 on 2017-11-9.
 */
@Configuration
public class ContextConfig {

    /*
    beam中的id和name是一回事
    这里bean的id和name就是generateCommonService
     */
    @Bean
    public AnotherServieceImpl generateCommonService(){
        return new AnotherServieceImpl();
    }
}
