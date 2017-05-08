package com.lilock;

/**
 * Created by Administrator on 2017-3-31.
 */
public interface ServiceBean {
    void addUser(String username, String password);
    void deleteUser(String username);
    boolean findUser(String username);
    String getPassword(String username);
}
