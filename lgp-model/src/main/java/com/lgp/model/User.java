package com.lgp.model;

import java.io.Serializable;

/**
 * 用户模型
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/1 17:56
 */
public class User implements Serializable {
    private String userId;
    private String username;
    private byte[] password;
    private String gendar;
    private Integer age;


    public User() {
    }

    public User(String userId, String username, byte[] password, String gendar, Integer age) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.gendar = gendar;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
