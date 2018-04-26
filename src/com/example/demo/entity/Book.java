package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private Long id;

    private Long bookStoreId;

    private String name;

    private String author;

    private BigDecimal price;

    private String topic;

    private Date publishDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookStoreId() {
        return bookStoreId;
    }

    public void setBookStoreId(Long bookStoreId) {
        this.bookStoreId = bookStoreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}