package com.example.recipes.services;

import com.example.recipes.domains.Recipe;

import java.util.Set;

public interface IRecipeService {
    Set<Recipe> getRecipes();
}
