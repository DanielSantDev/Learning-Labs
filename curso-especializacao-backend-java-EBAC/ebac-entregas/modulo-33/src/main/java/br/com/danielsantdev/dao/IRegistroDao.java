package main.java.br.com.danielsantdev.dao;

import main.java.br.com.danielsantdev.domain.Marca;
import main.java.br.com.danielsantdev.domain.Registro;

public interface IRegistroDao {

    Registro cadastrar(Registro reg);

    Registro buscarPorCodigoMarca(String codigoMarca);

    Registro buscarPorMarca(Marca marca);

    Registro buscarPorCodigoMarcaCriteria(String codigoMarca);
    Registro buscarPorMarcaCriteria(Marca marca);

}
