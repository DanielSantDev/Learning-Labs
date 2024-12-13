package br.com.msmeme.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.msmeme.client.MemeClient;
import br.com.msmeme.entity.CategoryMeme;
import br.com.msmeme.entity.Meme;
import br.com.msmeme.entity.User;
import br.com.msmeme.service.MemeService;

@RestController
@RequestMapping(path = "/memelandia")
public class MemeController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemeController.class);
    private final MemeService memeService;

    @Autowired
    private MemeClient memeClient;

    public MemeController(MemeService memeService) {
        this.memeService = memeService;
    }

    @GetMapping
    public Iterable<Meme> findAllMemes() {
        logger.info("Finding all memes");
        Iterable<Meme> memes = memeService.findAllMemes();
        long count = StreamSupport.stream(memes.spliterator(), false).count();
        logger.info("Found {} memes", count);
        return memes;
    }

    @PostMapping
    public Meme criarMeme(@RequestBody Meme meme) {
        logger.info("Creating meme: {}", meme);
        Long usuarioId = meme.getUsuarioId();
        Long categoriaMemeId = meme.getCategoriaMemeId();
        User user = memeClient.EncontrarUsuarioPorId(usuarioId);
        CategoryMeme categoriaMeme = memeClient.EncontrarCategoriaPorID(categoriaMemeId);
        if (user == null || categoriaMeme == null) {
            logger.warn("Usuario or categoria not found for meme: {}", meme);
            return null;
        }
        meme.setUsuarioId(user.getId());
        meme.setCategoriaMemeId(categoriaMeme.getId());
        Meme novoMeme = memeService.criarMeme(meme);
        logger.info("Meme created successfully: {}", novoMeme);
        return novoMeme;
    }

    @GetMapping("/categorias-meme")
    public Iterable<CategoryMeme> encontrarTodasCategorias() {
        logger.info("Finding all categorias");
        Iterable<CategoryMeme> categorias = memeClient.EncontrarTodasCategorias();
        long count = StreamSupport.stream(categorias.spliterator(), false).count();
        logger.info("Found {} categorias from meme", count);
        return categorias;
    }

    @GetMapping("/usuarios")
    public Iterable<User> encontrarTodosUsuarios() {
        logger.info("Finding all usuarios");
        Iterable<User> usuarios = memeClient.FindAllUsers();
        long count = StreamSupport.stream(usuarios.spliterator(), false).count();
        logger.info("Found {} usuarios", count);
        return usuarios;
    }

    @GetMapping("/meme-do-dia")
    public Meme encontrarMemeDoDia() {
        logger.info("Finding meme of the day");
        List<Meme> todosOsMemes = StreamSupport.stream(memeService.findAllMemes().spliterator(), false)
                .collect(Collectors.toList());
        if (todosOsMemes.isEmpty()) {
            logger.warn("None meme found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No meme was found in the database");
        }
        Collections.shuffle(todosOsMemes);
        Meme memeDoDia = todosOsMemes.get(0);
        logger.info("Meme found: {}", memeDoDia);
        return memeDoDia;
    }
}


