package com.example.androidproject.presentation.homeScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androidproject.R
import com.example.androidproject.presentation.components.HorizontalView
import com.example.androidproject.presentation.components.TextWithBoldUnderLine
import com.example.androidproject.presentation.components.VerticalAvoidCard
import com.example.androidproject.presentation.components.posts
import com.example.androidproject.presentation.navigation.Screens


@Composable
fun HomeScreen(navController:NavHostController) {
    LazyColumn (
        modifier = Modifier.padding(top = 10.dp)
    ){
        item{
            Column {
                // make title for "Advices" with small bold under line
                TextWithBoldUnderLine(
                    text = stringResource(R.string.advices),
                    lineColor  = MaterialTheme.colorScheme.onSecondary
                )

                HorizontalView(){
                    // on post click
                    // on user click on post to show its details
                    navController
                        .currentBackStackEntry
                        ?.savedStateHandle
                        ?.set("post", it) // new
                    navController.navigate(Screens.PostDetails.route)
                }


                // also make title for "Avoid" with small bold under line
                TextWithBoldUnderLine(
                    text = stringResource(R.string.avoid),
                    lineColor  = MaterialTheme.colorScheme.onSecondary
                )
            }
        }

        items(posts){
            VerticalAvoidCard(post = it) {
                // on post click
                // on user click on post to show its details
                navController
                    .currentBackStackEntry
                    ?.savedStateHandle
                    ?.set("post", it) // new
                navController.navigate(Screens.PostDetails.route)

            }
        }

    }

}