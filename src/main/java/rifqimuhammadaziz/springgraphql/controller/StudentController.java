package rifqimuhammadaziz.springgraphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.ContextValue;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import rifqimuhammadaziz.springgraphql.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Controller
public class StudentController {

    private Map<String, Student> map = new HashMap<>();
    private AtomicInteger id = new AtomicInteger();

    @QueryMapping
    public Student getStudentById(@Argument String id) {
        return map.get(id);
    }

    @MutationMapping
    public Student addStudent(@Argument String name, @Argument String faculty) {
        int id = this.id.incrementAndGet();
        Student student = new Student(String.valueOf(id), name, faculty);
        map.put(String.valueOf(id), student);
        return student;
    }

    @QueryMapping
    public List<Student> getStudents(@ContextValue Map<String, List<String>> headers) {
        System.out.println(headers);
        return map.values().stream().collect(Collectors.toList());
    }
}
