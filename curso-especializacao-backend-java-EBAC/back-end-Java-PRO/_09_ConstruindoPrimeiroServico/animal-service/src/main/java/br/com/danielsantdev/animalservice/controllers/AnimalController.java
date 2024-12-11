package br.com.danielsantdev.animalservice.controllers;

import br.com.danielsantdev.animalservice.entities.Animal;
import br.com.danielsantdev.animalservice.repositories.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll() {
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    @GetMapping("/resgates-por-funcionario")
    public Map<String, Long> getAnimalsRescuedByEmployee(@RequestParam Date startDate, @RequestParam Date endDate) {
        long diff = endDate.getTime() - startDate.getTime();
        if (diff > 365L * 24 * 60 * 60 * 1000) {
            throw new IllegalArgumentException("O intervalo de datas não pode exceder um ano.");
        }
        return repository.findAnimalsRescuedByEmployee(startDate, endDate);
    }
}