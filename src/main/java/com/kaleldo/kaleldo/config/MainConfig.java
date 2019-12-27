package com.kaleldo.kaleldo.config;

import com.kaleldo.kaleldo.pojo.Circle;
import com.kaleldo.kaleldo.registrar.EImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Circle.class, EImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfig {

}
