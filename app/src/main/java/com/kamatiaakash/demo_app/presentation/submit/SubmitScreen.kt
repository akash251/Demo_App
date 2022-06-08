package com.kamatiaakash.demo_app.presentation.submit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kamatiaakash.demo_app.R
import com.kamatiaakash.demo_app.presentation.destinations.SuccessScreenDestination
import com.kamatiaakash.demo_app.ui.theme.ChooseTypeBg
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun SubmitScreen(
    navigator: DestinationsNavigator,
    viewModel: SubmitScreenViewModel = viewModel()
) {

    val state = viewModel.state.value
    val items = viewModel.imageTypes

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Image preview",
            color = Color.Blue,
            fontSize = 25.sp
        )
        Image(
            painter = painterResource(id = R.drawable.img_preview),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RoundedCornerShape(10.dp))
        )

        Spacer(modifier = Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(10.dp),
                    color = Color.Black,
                )
                .background(color = ChooseTypeBg, shape = RoundedCornerShape(10.dp))
                .padding(10.dp)
                .clickable { viewModel.toggleDropDown() },

        ) {
            Row{
                Text(
                    text = state.selectedType,
                    textAlign = TextAlign.Center,
                )
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")

            }
        }

        Box{
            DropdownMenu(
                expanded = state.isDropDownExpanded,
                onDismissRequest = {
                    viewModel.onDropDownDismiss(expanded = false)
                },
                modifier = Modifier
                    .padding(10.dp)
                    .background(
                        color = Color.Gray,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .align(Alignment.Center)
            ) {
                Text(
                    text = "Choose Type",
                    textAlign = TextAlign.Center,
                    color = Color.Magenta,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                items.forEachIndexed { index, item ->
                    DropdownMenuItem(
                        onClick = {
                            viewModel.onMenuItemClicked(index = index, selectedItem = item)
                        },

                        ) {
                        Text(text = item)
                    }

                }
            }

        }
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter){
            Button(
                onClick =
                {
                    // TODO: if everything goes well the navigation can be done by code below
                        // if submission is successful the navigation to success screen
                          navigator.navigate(SuccessScreenDestination)
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Blue
                ),
                modifier = Modifier.padding(bottom = 28.dp)


            ) {
                Text(
                    text = "Submit",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
}

