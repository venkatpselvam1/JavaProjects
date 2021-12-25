package App.repository;

import App.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("studentRepository")
public class StudentsRepositoryInMemoryImpl implements StudentsRepository {
    @Override
    public List<Student> GetAllStudents()
    {
        var lis = new ArrayList<Student>();
        var s = new Student();
        s.setName("venkat");
        s.setAge(12);
        lis.add(s);
        return lis;
    }
}
