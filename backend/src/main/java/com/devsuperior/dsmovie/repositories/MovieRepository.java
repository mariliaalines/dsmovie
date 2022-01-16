package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

//responsável por acessar filmes, buscar...
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
