package cn.edu.njtech;

import java.io.Serializable;

/**
 * @author tim
 * @date 2022/9/18 4:16 下午
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
