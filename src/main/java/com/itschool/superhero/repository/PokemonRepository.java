package com.itschool.superhero.repository;

import com.itschool.superhero.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository <Pokemon, Long> {
}
