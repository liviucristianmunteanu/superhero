package com.itschool.superhero.repository;

import com.itschool.superhero.entity.Pokemon;
import com.itschool.superhero.entity.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PokemonRepository extends JpaRepository <Pokemon, Long> {
    @Query("SELECT p DISTINCT FROM Pokemon p ORDER BY p.name desc")
    List<Pokemon> findPokemonDistinctByName();
}
