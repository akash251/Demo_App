package com.kamatiaakash.demo_app.presentation.component

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextButtonUsed(
    text: String,
    buttonTextSize: TextUnit = 22.sp,
    buttonTextColor: Color = Color.Green,
    onClick: () -> Unit
) {
    TextButton(
        onClick = onClick,
    ) {
        Text(
            text = text,
            color = buttonTextColor,
            style = TextStyle(fontSize = buttonTextSize)

        )
    }

}