package com.example.restapiuser.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "TUSER")
public class UserEntity {
    @Id
    @Column(name = "USERID", length = 50, nullable = false)
    private String userid;

    @Column(name = "PASSWD", length = 100, nullable = false)
    private String password;

    @Column(name = "USERNAME", length = 100, nullable = false)
    private String username;

    @Column(name = "EMAIL", length = 200)
    private String email;

    @CreationTimestamp
    @Column(name = "INDATE", nullable = false, updatable = false)
    private LocalDateTime indate;

    // 기본 생성자
    public UserEntity() {}

    // 생성자
    public UserEntity(String userid, String passwd, String username, String email) {
        this.userid = userid;
        this.password = passwd;
        this.username = username;
        this.email = email;
    }

    public void prePresist() {
        if (this.indate == null) {
            this.indate = LocalDateTime.now();
        }
    }

    // Getter / Setter
    public LocalDateTime getIndate() {
        return indate;
    }
    public void setIndate(LocalDateTime indate) {
        this.indate = indate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }

    // ToString
    @Override
    public String toString() {
        return "UserEntity{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", indate=" + indate +
                '}';
    }
}
