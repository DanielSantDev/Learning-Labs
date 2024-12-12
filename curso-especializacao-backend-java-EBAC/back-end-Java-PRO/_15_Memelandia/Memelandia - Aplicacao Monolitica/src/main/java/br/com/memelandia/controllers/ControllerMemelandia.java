package br.com.memelandia.controllers;

import br.com.memelandia.entities.CategoriaMeme;
import br.com.memelandia.entities.Meme;
import br.com.memelandia.entities.Usuario;
import br.com.memelandia.services.ServicoMemelandia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class ControllerMemelandia {
    @Autowired
    private ServicoMemelandia servicoMemelandia;

    @GetMapping("/usuarios")
    public List<Usuario> buscaUsuarios() {
        return servicoMemelandia.listaTodosUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return servicoMemelandia.novoUsuario(usuario);
    }

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        return servicoMemelandia.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoMemelandia.novaCategoriaMeme(categoriaMeme);
    }

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        return servicoMemelandia.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        return servicoMemelandia.novoMeme(meme);
    }
}
