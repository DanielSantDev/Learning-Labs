package main.java.br.com.danielsantdev.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_REGISTRO")
public class Registro {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="regi_seq")
    @SequenceGenerator(name="regi_seq", sequenceName="sq_registro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "DATA_registro", nullable = false)
    private Instant dataregistro;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk",
            foreignKey = @ForeignKey(name = "fk_marca_registro"),
            referencedColumnName = "id", nullable = false
    )
    private Marca marca;

    @OneToOne
    @JoinColumn(name = "id_carro_fk",
            foreignKey = @ForeignKey(name = "fk_carro_registro"),
            referencedColumnName = "id", nullable = false
    )
    private Carro carro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Instant getDataregistro() {
        return dataregistro;
    }

    public void setDataregistro(Instant dataregistro) {
        this.dataregistro = dataregistro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setmarca(Marca marca) {
        this.marca = marca;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

}