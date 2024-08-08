package main.java.br.com.danielsantdev.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "data")
	private Instant data;
	
	@ManyToOne
	private Curso curso;
}
