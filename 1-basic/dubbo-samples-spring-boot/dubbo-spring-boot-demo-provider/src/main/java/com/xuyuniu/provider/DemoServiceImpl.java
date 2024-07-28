package com.xuyuniu.provider;

import com.xuyuniu.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author: xuyuniu
 **/
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
