package App.repository;

import App.model.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("studentRepository")
@Profile("prod")
public class StudentsRepositoryDataBaseImpl implements StudentsRepository {
    @Override
    public List<Student> GetAllStudents()
    {
        var lis = new ArrayList<Student>();
        // need to implement. need to connect to db.
        return lis;
    }
}
