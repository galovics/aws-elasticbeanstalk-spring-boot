package com.arnoldgalovics.blog.aws.elasticbeanstalk.springboot;

public class BookView {
    private String id;
    private String name;

    public BookView(Book book) {
        this.id = book.getId().toString();
        this.name = book.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
