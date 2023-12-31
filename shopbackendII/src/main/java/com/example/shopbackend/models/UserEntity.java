package com.example.shopbackend.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class UserEntity extends BaseEntity{
    @OneToMany(mappedBy = "user", targetEntity = Market.class, cascade = {CascadeType.MERGE})
    private List<Market> gameEntities;
    private String email;
    private String password;
    private String nickname;
    private Date regDate;

    protected UserEntity() {
    }

    public UserEntity(List<Market> gameEntities, String email, String password, String nickname, Date regDate) {
        this.gameEntities = gameEntities;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.regDate = regDate;
    }

    public List<Market> getGames() {
        return gameEntities;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setGames(List<Market> gameEntities) {
        this.gameEntities = gameEntities;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
