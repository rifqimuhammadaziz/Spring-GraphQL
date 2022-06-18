package rifqimuhammadaziz.springgraphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rifqimuhammadaziz.springgraphql.model.Author;
import rifqimuhammadaziz.springgraphql.model.Book;
import rifqimuhammadaziz.springgraphql.repository.AuthorRepository;
import rifqimuhammadaziz.springgraphql.repository.BookRepository;

import java.util.List;

@SpringBootApplication
public class SpringGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphQlApplication.class, args);
    }

//    @Bean
//    ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
//        return args -> {
//            Author xenosty = authorRepository.save(new Author(null, "Xenosty Theord"));
//            Author frozenost = authorRepository.save(new Author(null, "Frozenost Czorya"));
//            bookRepository.saveAll(List.of(
//                    new Book("Spring Framework", "Singapore", xenosty),
//                    new Book("Graphql & Spring", "Indonesia", frozenost)
//            ));
//        };
//    }

}
