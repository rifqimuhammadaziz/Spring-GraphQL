package rifqimuhammadaziz.springgraphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rifqimuhammadaziz.springgraphql.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
