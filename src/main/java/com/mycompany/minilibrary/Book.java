package com.mycompany.minilibrary;

public class Book {

    // encapsulation
    private String bookId;
    private String title;
    private String author;
    private String category;
    private String status;

    // constructor
    public Book(String bookId, String title, String author, String category, String status) 
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = status;
    }

    // getter method
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    // setter method
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}