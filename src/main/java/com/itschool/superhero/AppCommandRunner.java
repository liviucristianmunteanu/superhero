package com.itschool.superhero;

import com.github.javafaker.Faker;
import com.itschool.superhero.entity.Pokemon;
import com.itschool.superhero.entity.Superhero;
import com.itschool.superhero.repository.PokemonRepository;
import com.itschool.superhero.repository.SuperheroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {
    @Autowired
    private SuperheroRepository superheroRepository;

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public void run(String... args) throws Exception{

        Faker faker = new Faker();

        for (int i = 0; i < 50; i++) {

            Pokemon pokemon = new Pokemon();
            pokemon.setName(faker.pokemon().name());

            Pokemon pokemon2 = new Pokemon();
            pokemon2.setName(faker.pokemon().name());

            Pokemon pokemon3 = new Pokemon();
            pokemon3.setName(faker.pokemon().name());



            Superhero superhero = new Superhero();
            superhero.setName(faker.superhero().name());
            superhero.setSuperpower(faker.superhero().power());
            superhero.addPokemonToSuperhero(pokemon);
            superhero.addPokemonToSuperhero(pokemon2);
            superhero.addPokemonToSuperhero(pokemon3);


            superheroRepository.save(superhero);
        }




    }
}
