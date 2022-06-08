package com.kamatiaakash.demo_app.presentation.error

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamatiaakash.demo_app.R
import com.kamatiaakash.demo_app.ui.theme.ErrorColor
import com.kamatiaakash.demo_app.ui.theme.UploadButtonColor
import com.ramcosta.composedestinations.annotation.Destination


@Destination
@Composable
fun ErrorScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            contentDescription = "",
            painter = painterResource(id = R.drawable.submission_error),
            modifier = Modifier.clip(
                CircleShape
            )
        )
        Text(
            text = "Something",
            color = ErrorColor,
            fontSize = 19.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "went wrong",
            color = ErrorColor,
            fontSize = 19.sp,
            fontWeight = FontWeight.SemiBold
        )
        
        Spacer(modifier = Modifier.height(50.dp))

            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = UploadButtonColor
                ),
                modifier = Modifier.padding(bottom = 28.dp)


            ) {
                Text(
                    text = "Try Again",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = UploadButtonColor
            ),
            modifier = Modifier.padding(bottom = 28.dp)


        ) {
            Text(
                text = "Upload Again",
                color = Color.White,
                fontSize = 18.sp
            )
        }


    }

}