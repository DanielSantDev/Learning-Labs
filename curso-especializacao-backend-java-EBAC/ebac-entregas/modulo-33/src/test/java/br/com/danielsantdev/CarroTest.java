package test.java.br.com.danielsantdev;

import main.java.br.com.danielsantdev.dao.CarroDao;
import main.java.br.com.danielsantdev.dao.ICarroDao;
import main.java.br.com.danielsantdev.domain.Carro;
import main.java.br.com.danielsantdev.domain.Marca;
import main.java.br.com.danielsantdev.domain.Registro;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrarCarro(){
        Carro Corola = new Carro();
        Marca Toyota = new Marca();
        Registro A1 = new Registro();

        Corola.setCodigo("A1");
        Corola.setMarca(Toyota);
        Corola.setNome("CARRAO");
        Corola.setRegistro(A1);
        Corola = carroDao.cadastrar(Corola);

        assertNotNull(Corola);
        assertNotNull(Corola.getId());
        assertNotNull(Corola.getRegistro());
        assertNotNull(Corola.getNome());
    }
}
