package rifqimuhammadaziz.springgraphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rifqimuhammadaziz.springgraphql.model.Student;
import rifqimuhammadaziz.springgraphql.repository.StudentRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(String id) {
        Optional<Student> result = studentRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    @Override
    public Student addStudent(String name, String faculty) {
        Student student = studentRepository.save(new Student(null, name, faculty));
        return student;
    }

    @Override
    public List<Student> getStudents(Map<String, List<String>> headers) {
        return studentRepository.findAll();
    }
}
