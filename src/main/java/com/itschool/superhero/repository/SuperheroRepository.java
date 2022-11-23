package com.itschool.superhero.repository;

import com.itschool.superhero.entity.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository  <Superhero, Long>{
}
