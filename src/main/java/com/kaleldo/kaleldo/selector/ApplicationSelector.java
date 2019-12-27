package com.kaleldo.kaleldo.selector;

import com.kaleldo.kaleldo.pojo.TRole;
import com.kaleldo.kaleldo.pojo.TUser;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ApplicationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                TRole.class.getName(),
                TUser.class.getName()
        };
    }
}
