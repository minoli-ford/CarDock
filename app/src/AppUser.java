package com.example.cardock;

public class AppUser {
    private String name;
    private String password;

    public boolean validateLogin(String name, String password){
        if (this.name.equals(name) && this.password.equals(password))
            return true;
        else
            return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
