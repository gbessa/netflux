package br.com.hoptech.netflux.service;

import br.com.hoptech.netflux.domain.Movie;
import br.com.hoptech.netflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Flux<MovieEvent> events(String moviewId);

    Mono<Movie> getMoviewById(String id);

    Flux<Movie> getAllMovies();


}
