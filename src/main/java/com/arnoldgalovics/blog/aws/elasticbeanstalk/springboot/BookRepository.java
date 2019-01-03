package com.arnoldgalovics.blog.aws.elasticbeanstalk.springboot;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
