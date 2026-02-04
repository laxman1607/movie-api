package org.example.controller;


import jakarta.validation.Valid;
import org.example.model.Movie;
import org.example.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")

public class MovieController {
    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie){
        Movie saved=movieService.addMovie(movie);
        return ResponseEntity.ok(saved);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
