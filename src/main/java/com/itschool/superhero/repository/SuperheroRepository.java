package com.itschool.superhero.repository;

import com.itschool.superhero.entity.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuperheroRepository extends JpaRepository  <Superhero, Long>{
    List<Superhero> findByNameEndingWith(String name);
    List<Superhero> findByNameStartingWith(String name);

    List<Superhero> findAllSuperheroesByIdLessThanEqual(Long id);
    @Query("SELECT s FROM Superhero s WHERE s.name IS NULL OR s.superpower IS NULL")
    List<Superhero> findAllSuperheroesIsNull();
}
