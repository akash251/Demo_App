package com.kamatiaakash.demo_app.presentation.authentication

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kamatiaakash.demo_app.R
import com.kamatiaakash.demo_app.presentation.component.ButtonUsed
import com.kamatiaakash.demo_app.presentation.component.ButtonWithTextAndImage
import com.kamatiaakash.demo_app.presentation.component.TextButtonUsed
import com.kamatiaakash.demo_app.presentation.component.TextFormFieldUsed
import com.kamatiaakash.demo_app.presentation.destinations.UploadScreenDestination
import com.kamatiaakash.demo_app.ui.theme.ColorInLoginPage
import com.kamatiaakash.demo_app.ui.theme.ContinueWithFaceBookBg
import com.kamatiaakash.demo_app.ui.theme.SignInWithGoogleBg
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun AuthenticationScreen(
    navigator: DestinationsNavigator,
    viewModel: AuthScreenViewModel = viewModel()
) {

    val state = viewModel.state.value

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
       
    ) {
        Text(
            text = "Login",
            fontSize = 45.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        )

        TextFormFieldUsed(
            value = state.email,
            labelText = "Email",
            keyboardType = KeyboardType.Email,
            onValueChange = {
                            viewModel.onEmailValueChange(it)
            },
            leadingIcon = R.drawable.ic_baseline_email_24
        )

        TextFormFieldUsed(
            value = state.password,
            leadingIcon = R.drawable.vpn_key,
            keyboardType = KeyboardType.Password,
            visualTransformation = PasswordVisualTransformation(),
            labelText = "Password",
            onValueChange = {
               viewModel.onPasswordValueChange(it)
            },

        )
        ButtonUsed(
            text = "Login",
            buttonBg = ColorInLoginPage,
            buttonTextSize = 25.sp,
        ) {
            // TODO: Login functionality implementation 
        }
        TextButtonUsed(
            text = "Forgot password?",
            buttonTextColor = ColorInLoginPage
        ) {
            // TODO: Forgot Password implementation
        }

        Row(
            Modifier
                .padding(15.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Don't have an account?", fontSize = 20.sp)
            TextButtonUsed(text = "Sign Up", onClick = {
               // TODO: Navigate to SignUp Screen
            },
                buttonTextColor = ColorInLoginPage
            )
        }
        Text(text = "~OR~",fontSize = 20.sp)
        Spacer(modifier = Modifier.height(7.dp))
        ButtonWithTextAndImage(
            backgroundColor = SignInWithGoogleBg,
            text = "Sign in with Google",
            resourceId = R.drawable.google_icon,
            onClick = {
                // TODO: Implement Sign in with Google

                //if successful then navigation can be done
                navigator.navigate(UploadScreenDestination)
            }
        )
        Spacer(modifier = Modifier.height(30.dp))
        ButtonWithTextAndImage(
            backgroundColor = ContinueWithFaceBookBg,
            text = "Continue with Facebook",
            resourceId = R.drawable.facebook_icon,
            onClick = {
                // TODO: Implement Continue with Facebook 
            }
        )

    }

}