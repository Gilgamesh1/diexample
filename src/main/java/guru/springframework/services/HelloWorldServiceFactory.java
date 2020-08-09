package guru.springframework.services;

public class HelloWorldServiceFactory {

    public HelloWorldService createHelloWorldService(String idioma) {
        HelloWorldService helloWorldService = null;
        switch (idioma) {
            case "en":
                helloWorldService = new HelloWorldServiceEnglishImpl();
                break;
            case "sp":
                helloWorldService = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                new HelloWorldServiceFrenchImpl();
                break;
            case "pl":
                helloWorldService = new HelloWorldServicePolishImpl();
                break;
            case "ru":
                helloWorldService = new HelloWorldServiceRussianImpl();
                break;
        }
        return helloWorldService;
    }
}
