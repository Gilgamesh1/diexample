package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfigure {
    @Bean
    public HelloWorldServiceFactory helloWorldServiceFactory() {
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile({"default", "spanish"})
    public HelloWorldService helloWorldServiceSpanish(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("sp");
    }
}
