package br.com.categoriadomeme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.categoriadomeme.client.CategoryClient;
import br.com.categoriadomeme.entity.CategoryMeme;
import br.com.categoriadomeme.entity.User;
import br.com.categoriadomeme.service.CategoryServices;

@RestController
@RequestMapping(path = "/category")
public class CategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	private final CategoryServices categoryServices;
	
	@Autowired
	private CategoryClient categoryClient;
	
	public CategoryController(CategoryServices categoryServices) {
		this.categoryServices = categoryServices;
	}
	
	@GetMapping("/users")
    public Iterable<User> findAllUsers() {
        logger.info("Encontrando todos usuarios usuarios");
        Iterable<User> users = categoryClient.FindAllThem();
        int numUsers = 0;
        for(User user : users) {
            numUsers++;
        }
        logger.info("findAllUsers() returned {} users", numUsers);
        return users;
    }
	
	 @PostMapping
	    public CategoryMeme createCategory(@RequestBody CategoryMeme categoryMeme) {
	        logger.info("Creating category: {}", categoryMeme);
	        Long userId = categoryMeme.getUsuarioId();
	        User user = categoryClient.FindById(userId);
	        if (user == null) {
	            logger.info("createCategory() failed: user with ID {} not found", userId);
	            return null;
	        }
	        categoryMeme.setUsuarioId(user.getId());
	        CategoryMeme createCategory = categoryServices.createCategory(categoryMeme);
	        if (createCategory == null) {
	            logger.info("createCategory() failed: could not create categoryMeme={}", categoryMeme);
	        } else {
	            logger.info("createCategory() succeeded: categoryMeme={} created with ID {}", createCategory,
	                    createCategory.getId());
	        }
	        return createCategory;
	    }
	 
	 @GetMapping
	    public Iterable<CategoryMeme> findAllCategorys() {
	        logger.info("Procurando todas categorys");
	        Iterable<CategoryMeme> categorys = categoryServices.findTheAllCategorys();
	        int numCategorys = 0;
	        for (CategoryMeme category : categorys) {
	            numCategorys++;
	        }
	        logger.info("encontrarTodasCategorias() returned {} categorias", numCategorys);
	        return categorys;
	 }
	 
	  @GetMapping("/{id}")
	    public CategoryMeme findCategoryById(@PathVariable Long id) {
	        logger.info("Procurando categoria com id={}", id);
	        CategoryMeme category = categoryServices.findCategoryById(id);
	        if (category == null) {
	            logger.info("findCategoryById() failed: category with ID {} not found", id);
	        } else {
	            logger.info("findCategoryById() succeeded: category={} found", category);
	        }
	        return category;
	    }

}
