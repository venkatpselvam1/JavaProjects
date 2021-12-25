package App;

import App.repository.StudentsRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import App.service.Dependency;

public class Main {

    public static void main(String[] arr)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var dependency = applicationContext.getBean("dependency", Dependency.class);
        dependency.Print("venkat", 5);
        System.out.println("maven spring context project");
        StudentsRepository studentRepository = applicationContext.getBean("studentRepository", StudentsRepository.class);
        var students = studentRepository.GetAllStudents();
        for(var student: students)
        {
            System.out.println(student);
        }
    }
}
