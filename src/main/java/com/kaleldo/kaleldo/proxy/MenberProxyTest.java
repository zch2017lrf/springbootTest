package com.kaleldo.kaleldo.proxy;

import com.kaleldo.kaleldo.cglib.Menber;
import com.kaleldo.kaleldo.filter.MenberFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MenberProxyTest {

    @Test
    public void intercept() {
//        MenberProxy menberProxy = new MenberProxy();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Menber.class);
//        enhancer.setCallback(menberProxy);
//        Menber menber = (Menber) enhancer.create();
//        menber.info();
        MenberProxy menberProxy = new MenberProxy();
        MenberAnotherProxy menberAnotherProxy = new MenberAnotherProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Menber.class);
        enhancer.setCallbacks(new Callback[]{menberProxy,menberAnotherProxy,NoOp.INSTANCE});
        enhancer.setCallbackFilter(new MenberFilter());
        Menber menber = (Menber) enhancer.create();
        menber.info();
        menber.getList();
    }
}