package com.kamatiaakash.demo_app.presentation.splash_screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import com.kamatiaakash.demo_app.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kamatiaakash.demo_app.presentation.destinations.AuthenticationScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay


@Destination(start = true)
@Composable
fun SplashScreen(
    navigator: DestinationsNavigator,
) {
        var startAnimation by remember { mutableStateOf(false) }
        val alphaAnim = animateFloatAsState(
            targetValue = if (startAnimation) 1f else 0f,
            animationSpec = tween(
                durationMillis = 3000
            )
        )
        LaunchedEffect(key1 = true) {
            startAnimation = true
            delay(3000)
            // TODO: Logic for checking user authentication state

            navigator.navigate(AuthenticationScreenDestination)
        }
        Splash(alpha = alphaAnim.value)
    }

    @Composable
    fun Splash(alpha: Float) {
        Box(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.splash_screen_text),
                contentDescription = "",
                modifier = Modifier
                    .size(300.dp)
                    .alpha(alpha = alpha),
                )
        }
}