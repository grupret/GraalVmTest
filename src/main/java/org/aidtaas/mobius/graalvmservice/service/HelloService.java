package org.aidtaas.mobius.graalvmservice.service;

import org.springframework.stereotype.*;

@Component
public class HelloService {

  public String sayHello() {
    return "Hello GraalVM";
  }
}
