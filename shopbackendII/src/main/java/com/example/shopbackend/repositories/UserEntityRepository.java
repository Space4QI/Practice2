package com.example.shopbackend.repositories;


import com.example.shopbackend.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserEntityRepository extends JpaRepository <UserEntity, Integer>{
    public UserEntity findUserEntityByNickname(String nickname);

    @Query("SELECT u FROM UserEntity u WHERE u.regDate > :regDate AND SIZE(u.gameEntities) > 0 AND EXISTS (SELECT m FROM Market m WHERE\n"
            + "m.user = u AND m.game.price > :price AND \n" +
            "EXISTS (SELECT i FROM Item i WHERE i.game = m.game AND i.quality = :quality)) ORDER BY u.regDate DESC")
    List<UserEntity> findUserByDateByGamePriceByItemQuality(@Param("regDate") Date regDate, @Param("price") Double price, @Param("quality") Integer quality);


}
