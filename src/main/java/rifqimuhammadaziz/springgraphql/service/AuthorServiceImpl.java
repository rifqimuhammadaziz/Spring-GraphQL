package rifqimuhammadaziz.springgraphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rifqimuhammadaziz.springgraphql.model.Author;
import rifqimuhammadaziz.springgraphql.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author getAuthorById(String id) {
        Optional<Author> result = authorRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    @Override
    public Author addAuthor(String name) {
        Author author = authorRepository.save(new Author(null, name));
        return author;
    }

    @Override
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author updateAuthor(String id, String name) {
        Optional<Author> result = authorRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    @Override
    public void deleteAuthorById(String id) {
        authorRepository.deleteById(id);
    }


}
