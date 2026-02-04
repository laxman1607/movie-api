package org.example.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service


public class MovieService {
    private final List<Movie> movies= new ArrayList<>();
    private final AtomicLong idCounter= new AtomicLong(1);

    public Movie addMovie(Movie movie) {
        movie.setId(idCounter.getAndIncrement());
        movies.add(movie);
        return movie;


    }
    public Optional<Movie> getMovieById(Long id){
        return movies.stream()
                .filter(m -> id != null && id.equals(m.getId()))

                .findFirst();
    }
}
