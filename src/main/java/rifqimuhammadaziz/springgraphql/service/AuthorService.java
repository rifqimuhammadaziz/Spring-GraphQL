package rifqimuhammadaziz.springgraphql.service;

import rifqimuhammadaziz.springgraphql.model.Author;

import java.util.List;

public interface AuthorService {
    Author getAuthorById(String id);
    Author addAuthor(String name);
    List<Author> getAuthors();
    Author updateAuthor(String id, String name);
    void deleteAuthorById(String id);
}
