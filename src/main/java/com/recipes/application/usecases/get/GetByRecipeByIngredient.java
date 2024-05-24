package com.recipes.application.usecases.get;

import com.recipes.domain.model.Recipe;
import com.recipes.domain.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetByRecipeByIngredient {

    @Autowired
    private RecipeRepository repository;

    public List<Recipe> execute(String ingredient) {
        return repository.findByIngredientsContaining(ingredient);
    }
}