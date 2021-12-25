package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var printer = applicationContext.getBean("printer", Dependency.class);
        printer.print("venakt", 4);
        System.out.println("It is gradle spring context app");
    }
}
