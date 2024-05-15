package br.com.danielsantdev.service;

import br.com.danielsantdev.dao.ClienteDao;
import br.com.danielsantdev.dao.ClienteDaoMock;
import br.com.danielsantdev.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
