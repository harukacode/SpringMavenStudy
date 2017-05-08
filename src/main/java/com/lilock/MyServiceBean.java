package com.lilock;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-3-31.
 */
public class MyServiceBean implements ServiceBean {
    private String dir;
    private Map map = new HashMap();

    public void setUserDir(String dir) {
        this.dir = dir;
        System.out.println("Set user dir to: " + dir);
    }

    public void addUser(String username, String password) {
        if(!map.containsKey(username))
            map.put(username, password);
        else
            throw new RuntimeException("User already exist.");
    }

    public void deleteUser(String username) {
        if(map.remove(username)==null)
            throw new RuntimeException("User not exist.");
    }

    public boolean findUser(String username) {
        return map.containsKey(username);
    }

    public String getPassword(String username) {
        return (String)map.get(username);
    }
}
