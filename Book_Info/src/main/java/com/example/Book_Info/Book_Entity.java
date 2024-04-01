package com.example.Book_Info;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

import java.util.Date;

@Entity
public class Book_Entity {
    @Id
    private Integer id;
    private String Book_name;
    private String auther;
    private Date publish_Date;
    private String review;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public Date getPublish_Date() {
        return publish_Date;
    }

    public void setPublish_Date(Date publish_Date) {
        this.publish_Date = publish_Date;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Book_Entity(Integer id, String book_name, String auther, Date publish_Date, String review) {
        this.id = id;
        Book_name = book_name;
        this.auther = auther;
        this.publish_Date = publish_Date;
        this.review = review;
    }

    public Book_Entity() {
    }
}
