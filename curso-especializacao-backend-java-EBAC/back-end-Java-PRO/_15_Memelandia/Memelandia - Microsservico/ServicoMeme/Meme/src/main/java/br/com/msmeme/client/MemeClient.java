package br.com.msmeme.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.msmeme.entity.CategoryMeme;
import br.com.msmeme.entity.User;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class MemeClient {
    @Autowired
    private ICategoriaClient iCategoriaClient;

    @Autowired
    private IUserClient iUsuarioClient;

    @FeignClient(name = "categoria")
    interface ICategoriaClient {
        @RequestMapping(path = "/categorias-meme", method = RequestMethod.GET)
        @ResponseBody
        Iterable<CategoryMeme> encontrarTodasCategorias();

        @RequestMapping(path = "/categorias-meme/{id}", method = RequestMethod.GET)
        @ResponseBody
        CategoryMeme encontrarCategoriaPorId(@PathVariable("id") Long id);
    }
    
    @FeignClient(name = "usuarios")
    interface IUserClient {
        @RequestMapping(path = "/usuarios", method = RequestMethod.GET)
        @ResponseBody
        Iterable<User> encontrarTodos();

        @RequestMapping(path = "/usuarios/{id}", method = RequestMethod.GET)
        @ResponseBody
        User encontrarPorId(@PathVariable("id") Long id);
    }

    public Iterable<CategoryMeme> EncontrarTodasCategorias() {
        return iCategoriaClient.encontrarTodasCategorias();
    }

    public Iterable<User> FindAllUsers() {
        return iUsuarioClient.encontrarTodos();
    }

    public User EncontrarUsuarioPorId(Long id) {
        return iUsuarioClient.encontrarPorId(id);
    }

    public CategoryMeme EncontrarCategoriaPorID(Long id) {
        return iCategoriaClient.encontrarCategoriaPorId(id);
    }
}