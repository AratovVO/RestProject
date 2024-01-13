package com.example.RestProject;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class User {
    private String username;
    private List<Post> posts;
    public User(){
        posts = new ArrayList<>();
    }

    public User(String username, List<Post> posts) {
        this.username = username;
        this.posts = posts;
    }

}
