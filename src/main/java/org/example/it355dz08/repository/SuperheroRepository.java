package org.example.it355dz08.repository;

import org.example.it355dz08.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {

    Optional<Superhero> findSuperheroById(int id);

    Optional<Superhero> findFirstBySuperHeroName(String superHeroName);

    List<Superhero> findByPublisher_PublisherName(String publisherName);

    List<Superhero> findByAlignment_Alignment(String alignment);

    List<Superhero> findByWeightKgLessThan(int weight);

    List<Superhero> findByHeightCmGreaterThan(int height);

    List<Superhero> findByEyeColour_Colour(String eyeColour);

    List<Superhero> findByHairColour_Colour(String hairColour);

    List<Superhero> findByRace_Race(String race);

    List<Superhero> findBySuperpower_PowerName(String superpowerName);
}
