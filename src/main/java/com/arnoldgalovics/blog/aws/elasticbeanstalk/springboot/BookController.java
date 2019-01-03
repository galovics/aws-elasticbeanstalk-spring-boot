package com.arnoldgalovics.blog.aws.elasticbeanstalk.springboot;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Collection<BookView> get() {
        return repository.findAll().stream().map(BookView::new).collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity post(@RequestBody CreateBookRequest request) {
        repository.save(new Book(request.getName()));
        return ResponseEntity.ok().build();
    }
}
