package com.itschool.superhero.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String superpower;

    @OneToMany(mappedBy = "superhero", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Pokemon> pokemons = new ArrayList<>();

    public void addPokemonToSuperhero(Pokemon p) {
        pokemons.add(p);
        p.setSuperhero(this);

    }
}
