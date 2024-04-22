package org.aidtaas.mobius.graalvmservice.controller;

import org.aidtaas.mobius.graalvmservice.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

  @Autowired
  public HelloService helloService;


  @GetMapping("/")
  public String getValue() {
    System.out.println("hello");
    return helloService.sayHello();
  }
}
