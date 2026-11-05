package org.example;

public class User {
    private String username;
    private Role role;

    public User(String username, Role role) {
        this.username = username;
        this.role = role;
    }

    public User(){}

    public String getUsername() { return username; }
    public Role getRole() { return role; }

    public String toString() {
        return username + " (" + role + ")";
    }
}