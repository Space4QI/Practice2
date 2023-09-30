package com.example.shopbackend.DTO;

public class UserGameItemBondDTO {

    private UserEntityDTO user;

    private GameDTO game;

    private ItemDTO item;

    public UserGameItemBondDTO(UserEntityDTO user, GameDTO game, ItemDTO item){
        this.user = user;
        this.game = game;
        this.item = item;
    }

    public UserEntityDTO getUser() {
        return user;
    }

    public void setUser(UserEntityDTO user) {
        this.user = user;
    }

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }
}
