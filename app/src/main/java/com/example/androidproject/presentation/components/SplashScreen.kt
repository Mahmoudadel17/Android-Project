package com.example.androidproject.presentation.components



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidproject.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreen() {
    Box(modifier = Modifier
        .fillMaxSize().background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ){

        Image(
            painter = painterResource(id = R.drawable.logonobackground),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            contentDescription = "splash image",
        )

    }
}
