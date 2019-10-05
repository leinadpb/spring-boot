package com.leinad.service.services;

import com.leinad.service.interfaces.IHelloService;
import org.springframework.stereotype.Service;
import com.leinad.core.models.HelloModel;

@Service
public class HelloService implements IHelloService {

    @Override
    public HelloModel sayHello(String name) {
        HelloModel result = new HelloModel();
        result.setMessage(String.format("Hello %s", name));
        return result;
    }
}
