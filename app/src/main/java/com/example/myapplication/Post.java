package com.example.myapplication;

public class Post {
    private int id;
    private String title;
    private String body;
    private String url;

    public Post(int id, String title, String body, String url) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
