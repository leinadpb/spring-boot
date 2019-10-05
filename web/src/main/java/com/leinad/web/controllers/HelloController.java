package com.leinad.web.controllers;

import com.leinad.core.common.MediaTypes;
import com.leinad.core.models.HelloModel;
import com.leinad.service.services.HelloService;
import com.leinad.web.dto.HelloDto;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello", produces={MediaTypes.JSON, MediaTypes.XML}, consumes={MediaTypes.JSON, MediaTypes.XML})
public class HelloController {

    private HelloService helloService;
    private ModelMapper modelMapper;

    public HelloController(HelloService _helloService, ModelMapper modelMapper) {

        this.helloService = _helloService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<HelloDto> sayHello(@RequestBody HelloDto request) {
        HelloModel result = this.helloService.sayHello(request.name);
        HelloDto helloDto = modelMapper.map(result, HelloDto.class);

        return new ResponseEntity<HelloDto>(helloDto, HttpStatus.OK);
    }
}
