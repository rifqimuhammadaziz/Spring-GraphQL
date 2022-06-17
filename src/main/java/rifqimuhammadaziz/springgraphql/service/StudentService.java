package rifqimuhammadaziz.springgraphql.service;

import rifqimuhammadaziz.springgraphql.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Student getStudentById(String id);
    Student addStudent(String name, String faculty);
    List<Student> getStudents(Map<String, List<String>> headers);
}
