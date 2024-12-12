package br.com.memelandia.repositories;

import br.com.memelandia.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
