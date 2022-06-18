package rifqimuhammadaziz.springgraphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import rifqimuhammadaziz.springgraphql.model.Author;
import rifqimuhammadaziz.springgraphql.repository.AuthorRepository;
import rifqimuhammadaziz.springgraphql.service.AuthorService;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @QueryMapping
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @QueryMapping
    public Author getAuthorById(@Argument String id) {
        return authorService.getAuthorById(id);
    }

    @MutationMapping
    public Author addAuthor(@Argument String name) {
        return authorService.addAuthor(name);
    }

    @MutationMapping
    public void deleteAuthor(@Argument String id) {
        authorService.deleteAuthorById(id);
    }

    @MutationMapping
    public Author updateAuthor(@Argument String id, @Argument String name) {
        return authorService.updateAuthor(id, name);
    }
}
