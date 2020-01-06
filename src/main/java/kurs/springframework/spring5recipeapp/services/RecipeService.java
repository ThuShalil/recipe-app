package kurs.springframework.spring5recipeapp.services;

import kurs.springframework.spring5recipeapp.commands.RecipeCommand;
import kurs.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService
{
    Set<Recipe> getRecipes();
    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(long l);

    void deleteById(Long idToDelete);
}
