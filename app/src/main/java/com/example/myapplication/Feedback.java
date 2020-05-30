package com.example.myapplication;

public class Feedback {
    private int id;
    private String email;
    private String name;
    private String body;

    public Feedback(int id, String email, String name, String body) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
