package com.feng.entitiy;

/**
 * @Author: zzf
 * @Date: 2021/2/3 14:42
 * @Description:
 */
public class User {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
