package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;

public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceRussian;
    private HelloWorldService helloWorldServiceFrench;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServiceRussian(HelloWorldService helloWorldService) {
        this.helloWorldServiceRussian = helloWorldService;
    }

    public void setHelloWorldServiceFrench(HelloWorldService helloWorldService) {
        this.helloWorldServiceFrench = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloWorldServiceRussian.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }
}
