package com.kamatiaakash.demo_app.presentation.success

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
import com.kamatiaakash.demo_app.presentation.destinations.ErrorScreenDestination
import com.kamatiaakash.demo_app.ui.theme.SuccessColor
import com.kamatiaakash.demo_app.ui.theme.UploadButtonColor
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun SuccessScreen(
    navigator: DestinationsNavigator
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            contentDescription = "",
            painter = painterResource(id = R.drawable.submitted_successfully),
            modifier = Modifier.clip(
                CircleShape
            )
        )
        Text(
            text = "Image",
            color = SuccessColor,
            fontSize = 19.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Uploaded",
            color = SuccessColor,
            fontSize = 19.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Successfully!",
            color = SuccessColor,
            fontSize = 19.sp,
            fontWeight = FontWeight.SemiBold
        )
        
        Spacer(modifier = Modifier.height(50.dp))

            Button(
                onClick = {
                    // TODO: If something goes wrong then we will navigate to errorscreen
                          navigator.navigate(ErrorScreenDestination) },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = UploadButtonColor
                ),
                modifier = Modifier.padding(bottom = 28.dp)


            ) {
                Text(
                    text = "Upload more",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }


    }

}