package com.nisaefendioglu.composablecookbook.model
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nisaefendioglu.composablecookbook.card.RecipeCard


@Composable
fun RecipeList(recipes: List<Recipe>) {
  LazyColumn {
    items(recipes) { item ->
      RecipeCard(recipe = item, modifier = Modifier.padding(15.dp))
    }
  }
}


