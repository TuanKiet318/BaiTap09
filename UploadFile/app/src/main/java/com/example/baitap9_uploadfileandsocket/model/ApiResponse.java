package com.example.baitap9_uploadfileandsocket.model;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ApiResponse {
    @SerializedName("success")
    private boolean success;

    @SerializedName("message")
    private String message;

    @SerializedName("result")
    private User user;

    // Getters and Setters

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void User(User user) {
        this.user = user;
    }
}