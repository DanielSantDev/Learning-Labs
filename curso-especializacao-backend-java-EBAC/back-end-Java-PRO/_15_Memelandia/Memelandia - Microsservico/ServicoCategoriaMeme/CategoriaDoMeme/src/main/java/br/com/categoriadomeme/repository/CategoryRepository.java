package br.com.categoriadomeme.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.categoriadomeme.entity.CategoryMeme;

public interface CategoryRepository extends CrudRepository<CategoryMeme, Long> {

}
