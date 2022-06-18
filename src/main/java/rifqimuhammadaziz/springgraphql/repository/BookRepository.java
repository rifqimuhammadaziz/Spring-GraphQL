package rifqimuhammadaziz.springgraphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rifqimuhammadaziz.springgraphql.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
}
