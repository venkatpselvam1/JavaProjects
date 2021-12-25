package App;

import App.repository.StudentsRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import App.service.Dependency;

import java.sql.DriverManager;

public class Main {

    public static void main(String[] arr) throws Exception
    {
        // To register MS SQL driver
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("maven spring context project");
        StudentsRepository studentRepository = applicationContext.getBean("studentRepository", StudentsRepository.class);
        var students = studentRepository.GetAllStudents();
        for(var student: students)
        {
            System.out.println(student);
        }
    }
}
