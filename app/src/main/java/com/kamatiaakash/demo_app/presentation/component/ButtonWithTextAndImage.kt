package com.kamatiaakash.demo_app.presentation.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonWithTextAndImage(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    textColor: Color = Color.White,
    text:String,
    textFontSize:TextUnit = 20.sp,
    roundedCornerShape: Dp = 0.dp,
    iconTextSpacing:Dp = 20.dp,
    @DrawableRes resourceId:Int,
    onClick:() -> Unit
    ) {
    
   Box(
       modifier = modifier
           .padding(start = 20.dp, end = 20.dp)
           .background(color = backgroundColor, shape = RoundedCornerShape(roundedCornerShape))
           .clickable {
               onClick()
           },

   ){
       Row(
           modifier = Modifier
               .fillMaxWidth()
               .padding(1.dp),
           horizontalArrangement = Arrangement.Start,
           verticalAlignment = Alignment.CenterVertically
       ) {
          Image(
              painter = painterResource(id = resourceId),
              contentDescription = "",
              modifier = Modifier.size(50.dp)
          )
           Spacer(modifier = Modifier.width(iconTextSpacing))
           Text(
               text = text,
               color = textColor,
               fontSize = textFontSize
           )

       }
   }
    
}