package App.repository;

import App.model.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository("studentRepository")
@Profile("prod")
public class StudentsRepositoryDataBaseImpl implements StudentsRepository {
    @Override
    public List<Student> GetAllStudents()
    {
        var lis = new ArrayList<Student>();
        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver://localhost;databaseName=school;username=diner;password=diner;";
            conn = DriverManager.getConnection(dbURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while(rs.next()){
                var student = new Student();
                student.setAge(rs.getInt("age"));
                student.setName(rs.getString("name"));
                lis.add(student);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return lis;
    }
}
