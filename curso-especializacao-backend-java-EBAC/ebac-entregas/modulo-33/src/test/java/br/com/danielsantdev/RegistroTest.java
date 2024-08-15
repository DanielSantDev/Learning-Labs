package test.java.br.com.danielsantdev;

import main.java.br.com.danielsantdev.dao.*;
import main.java.br.com.danielsantdev.domain.*;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RegistroTest {
    
    private IRegistroDao registroDao;

    private IMarcaDao marcaDao;

    private ICarroDao carroDao;

    private IAcessorioDao acessorioDao;

    public RegistroTest() {
        registroDao = new RegistroDao();
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = criarMarca("A1");
        Carro carro = criarCarro("A1");

        Registro regi = new Registro();
        regi.setCodigo("A1");
        regi.setDataregistro(Instant.now());
        regi.setStatus("ATIVO");
        regi.setValor(2000d);
        regi.setmarca(marca);
        regi.setCarro(carro);

        carro.setRegistro(regi);
        regi = registroDao.cadastrar(regi);

        assertNotNull(regi);
        assertNotNull(regi.getId());

        Registro regiBD = registroDao.buscarPorCodigoMarca(regi.getCodigo());
        assertNotNull(regiBD);
        assertEquals(regi.getId(), regiBD.getId());

        Registro regiBDObj = registroDao.buscarPorMarca(marca);
        assertNotNull(regiBDObj);
        assertEquals(regi.getId(), regiBDObj.getId());
    }

    private Acessorio criarAcessorio(String codigo) {
        Acessorio aces = new Acessorio();
        aces.setCodigo(codigo);
        aces.setDescricao("Acessorio 1");
        return aces;
    }

    private Carro criarCarro(String codigo) {
        Acessorio comp = criarAcessorio("A1");
        Acessorio comp2 = criarAcessorio("A2");
        Carro carro = new Carro();
        carro.setCodigo(codigo);
        carro.setNome("Daniel");
        carro.add(comp);
        carro.add(comp2);
        return carroDao.cadastrar(carro);
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setDescricao("deluxe cars");
        marca.setNome("Ferrari");
        return marcaDao.cadastrar(marca);
    }
    
}
