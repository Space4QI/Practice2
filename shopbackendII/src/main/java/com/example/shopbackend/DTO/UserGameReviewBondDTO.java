package com.example.shopbackend.DTO;

public class UserGameReviewBondDTO {

    private UserEntityDTO user;

    private GameDTO game;

    private ReviewEntityDTO review;

    public UserGameReviewBondDTO(UserEntityDTO user, GameDTO game, ReviewEntityDTO review){
        this.user = user;
        this.game = game;
        this.review = review;
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

    public ReviewEntityDTO getReview() {
        return review;
    }

    public void setReview(ReviewEntityDTO review) {
        this.review = review;
    }
}
