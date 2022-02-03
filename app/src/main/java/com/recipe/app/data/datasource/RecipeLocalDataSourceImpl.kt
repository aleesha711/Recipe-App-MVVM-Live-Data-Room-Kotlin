package com.recipe.app.data.datasource

import androidx.lifecycle.LiveData
import com.recipe.app.db.RecipeDatabase
import com.recipe.app.db.entity.Recipe
import javax.inject.Inject

class RecipeLocalDataSourceImpl @Inject constructor(
    private val recipeDatabase: RecipeDatabase
) : RecipeLocalDataSource {

    override suspend fun insert(recipe: Recipe) {
        recipeDatabase.recipeDao().insert(recipe)
    }

    override suspend fun getAllRecipes(): LiveData<List<Recipe>> {
        return recipeDatabase.recipeDao().getAllRecipes()
    }
}
