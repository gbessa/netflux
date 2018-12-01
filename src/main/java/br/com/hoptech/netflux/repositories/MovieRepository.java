package br.com.hoptech.netflux.repositories;

import br.com.hoptech.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

}
