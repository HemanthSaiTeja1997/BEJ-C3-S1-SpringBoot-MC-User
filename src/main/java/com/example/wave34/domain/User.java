/*
 *Author Name :P.Hemanth Sai Teja
 *Date:29-11-2022
 *Created With: IntelliJ IDEA Community Edition
 */

package com.example.wave34.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int uid;
    private String username;
    private String address;
    private String password;

    public User() {
    }

    public User(int uid, String username, String address, String password) {
        this.uid = uid;
        this.username = username;
        this.address = address;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
