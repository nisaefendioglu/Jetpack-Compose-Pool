package com.nisaefendioglu.composablecookbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import com.nisaefendioglu.composablecookbook.model.RecipeList
import com.nisaefendioglu.composablecookbook.model.defaultRecipes
import com.nisaefendioglu.composablecookbook.ui.theme.ComposableCookBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableCookBookTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    TopAppBar(title = {
                        Text("Cook Book \uD83D\uDC69\uD83C\uDFFB\u200D\uD83C\uDF73")
                    })
                    RecipeList(defaultRecipes)
                }
            }
        }
    }
}
