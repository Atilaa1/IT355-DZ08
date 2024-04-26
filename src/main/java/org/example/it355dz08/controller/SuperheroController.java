package org.example.it355dz08.controller;

import org.example.it355dz08.model.Superhero;
import org.example.it355dz08.repository.SuperheroRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superhero")
public class SuperheroController {

    private final SuperheroRepository superheroRepository;


    public SuperheroController(SuperheroRepository superheroService) {
        this.superheroRepository = superheroService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Superhero> getSuperheroById(@PathVariable("id") int id) {
        Optional<Superhero> superhero = superheroRepository.findSuperheroById(id);

        return superhero.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Superhero> getSuperheroBySuperHeroName(@PathVariable("name") String name) {
        Optional<Superhero> superhero = superheroRepository.findFirstBySuperHeroName(name);

        return superhero.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/publisher{publisherName}")
    public ResponseEntity<List<Superhero>> getByPublisherName(@PathVariable("publisherName") String publisherName) {
        return ResponseEntity.ok(superheroRepository.findByPublisher_PublisherName(publisherName));
    }

    @GetMapping("/alignment/{alignment}")
    public ResponseEntity<List<Superhero>> getByAlignment(@PathVariable("alignment") String alignment) {
        return ResponseEntity.ok(superheroRepository.findByAlignment_Alignment(alignment));
    }

    @GetMapping("/weightLess/{weightKg}")
    public ResponseEntity<List<Superhero>> getByWeightKgLessThan(@PathVariable("weightKg") int weightKg) {
        return ResponseEntity.ok(superheroRepository.findByWeightKgLessThan(weightKg));
    }

    @GetMapping("/height/{heightCm}")
    public ResponseEntity<List<Superhero>> getByByHeightCmGreaterThan(@PathVariable("heightCm") int heightCm) {
        return ResponseEntity.ok(superheroRepository.findByHeightCmGreaterThan(heightCm));
    }
    
    @GetMapping("/eyeColour{eyeColour}")
    public ResponseEntity<List<Superhero>> getByEyeColour(@PathVariable("eyeColour") String eyeColour) {
        return ResponseEntity.ok(superheroRepository.findByEyeColour_Colour(eyeColour));
    }

    @GetMapping("/hairColour/{hairColour}")
    public ResponseEntity<List<Superhero>> getByHairColour(@PathVariable("hairColour") String hairColour) {
        return ResponseEntity.ok(superheroRepository.findByHairColour_Colour(hairColour));
    }

    @GetMapping("/race/{race}")
    public ResponseEntity<List<Superhero>> getByRace(@PathVariable("race") String race) {
        return ResponseEntity.ok(superheroRepository.findByRace_Race(race));
    }


    @GetMapping("/superpowername/{superpowerName}")
    public ResponseEntity<List<Superhero>> getBySuperpowerName(@PathVariable("superpowerName") String superpowerName) {
        return ResponseEntity.ok(superheroRepository.findBySuperpower_PowerName(superpowerName));
    }
}
