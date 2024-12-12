package br.com.memelandia.repositories;

import br.com.memelandia.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
