package com.nisaefendioglu.composablecookbook.card

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.nisaefendioglu.composablecookbook.model.Recipe
import com.nisaefendioglu.composablecookbook.model.defaultRecipes


@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier) {
    Surface(shape = RoundedCornerShape(20.dp), elevation = 15.dp, modifier = modifier) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(painterResource(recipe.imageResource), "",
                contentScale = ContentScale.Crop, // crop the image if it's not a square
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f))
            Column(modifier = Modifier.padding(15.dp)) {
                Text(recipe.title, style = MaterialTheme.typography.h4)
                for (ingredient in recipe.ingredients) {
                    Text("- $ingredient")
                }
            }
        }
    }
}


// Since RecipeCard() takes a parameter, you can’t use @Preview. However, you can create another composable method that supplies a default RecipeCard(). Add the following below RecipeCard()

@Composable
@Preview
fun DefaultRecipeCard() {
    MaterialTheme {
        RecipeCard(defaultRecipes[0], modifier = Modifier.padding(25.dp))
    }
}
