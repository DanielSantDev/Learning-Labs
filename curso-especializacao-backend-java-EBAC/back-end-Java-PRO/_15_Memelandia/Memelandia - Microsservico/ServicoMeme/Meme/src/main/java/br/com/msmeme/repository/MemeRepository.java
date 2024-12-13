package br.com.msmeme.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.msmeme.entity.Meme;

public interface MemeRepository extends CrudRepository<Meme, Long> {

}
