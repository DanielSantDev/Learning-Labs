package br.com.danielsantdev.animalservice.repositories;

import br.com.danielsantdev.animalservice.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("""
        SELECT a.nomeRecebedor AS funcionario, COUNT(a) AS total 
        FROM Animal a 
        WHERE a.dataEntrada BETWEEN :startDate AND :endDate 
        GROUP BY a.nomeRecebedor
    """)

    Map<String, Long> findAnimalsRescuedByEmployee(Date startDate, Date endDate);
}
