package com.example.newsapp;

public class News {
    private String title;
    private String author;
    private String date;
    private String section;
    private String link;

    private Boolean authorNameProvided = false;

    public News(String title, String section,String date,String link){
        this.title = title;
        this.section = section;
        this.date = date;
        this.link = link;
    }
    public News(String title,String section,String date,String link, String author){
        this.title = title;
        this.section = section;
        this.date = date;
        this.author = author;
        this.link = link;
        this.authorNameProvided = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getSection() {
        return section;
    }

    public Boolean getAuthorNameProvided() {
        return authorNameProvided;
    }

    public String getLink() {
        return link;
    }
}
