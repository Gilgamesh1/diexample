package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfigure {
    @Bean
    public HelloWorldServiceFactory helloWorldServiceFactory() {
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglishImpl(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile({"default", "spanish"})
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("sp");
    }


    @Bean(name = "french")
    public HelloWorldService helloWorldServicFrench(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("pl");
    }

    @Bean
    @Qualifier("helloWorldServiceRussian")
    public HelloWorldService helloWorldServiceRussian(HelloWorldServiceFactory helloWorldServiceFactory) {
        return helloWorldServiceFactory.createHelloWorldService("ru");
    }
}
