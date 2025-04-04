package com.example.baitap9_uploadfileandsocket.model;

public class ImageUpload {
    private int id;
    private String username;
    private String avatar;

    // Constructor
    public ImageUpload(int id, String username, String avatar) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "ImageUpload{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}

