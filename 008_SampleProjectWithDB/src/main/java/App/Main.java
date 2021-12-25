package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] arr)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var dependency = applicationContext.getBean("dependency", Dependency.class);
        dependency.Print("venkat", 5);
        System.out.println("maven spring context project");
    }
}
