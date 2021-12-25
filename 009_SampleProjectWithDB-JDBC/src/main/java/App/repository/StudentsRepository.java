package App.repository;

import App.model.Student;

import java.util.List;

public interface StudentsRepository {
    List<Student> GetAllStudents();
}
