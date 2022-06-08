package com.kamatiaakash.demo_app.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonUsed(
    modifier: Modifier = Modifier,
    text: String,
    buttonTextSize: TextUnit = 22.sp,
    buttonBg: Color = Color.Green,
    buttonTextColor: Color = Color.White,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier

            .padding(horizontal = 15.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(25.dp))
            .height(55.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = buttonBg)
    ) {

        Text(
            text = text,
            color = buttonTextColor,
            style = TextStyle(fontSize = buttonTextSize)

        )
    }
}