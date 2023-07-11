package com.devSuperiorSamuel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperiorSamuel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
