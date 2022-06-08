package com.kamatiaakash.demo_app.presentation.upload

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamatiaakash.demo_app.R
import com.kamatiaakash.demo_app.presentation.component.ButtonWithTextAndImage
import com.kamatiaakash.demo_app.presentation.destinations.SubmitScreenDestination
import com.kamatiaakash.demo_app.ui.theme.CaptureNewImageBg
import com.kamatiaakash.demo_app.ui.theme.ChooseFromGalleryBg
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun UploadScreen(
    navigator: DestinationsNavigator
) {


    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {


        Box(contentAlignment =Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = colorResource(id = R.color.purple_700),
                    shape = RoundedCornerShape(
                        bottomStart = 30.dp,
                        bottomEnd = 30.dp
                    )

                )
                .padding(top = 50.dp, bottom = 50.dp)

        ) {

            Text(
                text = "Upload Image",
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(190.dp))


        ButtonWithTextAndImage(
            backgroundColor = CaptureNewImageBg,
            text = "Capture new image",
            resourceId = R.drawable.camera_icon,
            roundedCornerShape = 10.dp,
            iconTextSpacing = 0.dp,
        ) {
            // TODO: On Choose from Gallery Click
        }
        Spacer(modifier = Modifier.height(14.dp))
        ButtonWithTextAndImage(
            backgroundColor = ChooseFromGalleryBg,
            text = "Choose from Gallery",
            resourceId = R.drawable.img,
            roundedCornerShape = 10.dp,
            iconTextSpacing = 0.dp,
        ) {
            // TODO: On Choose from Gallery Click
        }
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
            Button(
                onClick = {
                    // TODO: If everything goes as expected then we will navigate to submit screen
                    navigator.navigate(SubmitScreenDestination) },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Blue
                ),
                modifier = Modifier.padding(bottom = 28.dp, end = 20.dp)


            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
}