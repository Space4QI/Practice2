package com.example.shopbackend.DTO;

public class GameItemDTO {
    private GameDTO game;

    private ItemDTO item;

    public GameItemDTO(GameDTO game, ItemDTO item){
        this.game = game;
        this.item = item;
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
