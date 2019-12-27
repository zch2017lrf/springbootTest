package com.kaleldo.kaleldo.registrar;

import com.kaleldo.kaleldo.pojo.TMenu;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
public class EImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(TMenu.class);
            // 注册一个名字叫做 kaleldo 的 bean
        beanDefinitionRegistry.registerBeanDefinition("kaleldo", rootBeanDefinition);
    }
}
