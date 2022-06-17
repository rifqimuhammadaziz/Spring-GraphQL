package rifqimuhammadaziz.springgraphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rifqimuhammadaziz.springgraphql.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
