package com.devSuperiorSamuel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperiorSamuel.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
