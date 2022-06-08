package com.kamatiaakash.demo_app.presentation.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamatiaakash.demo_app.ui.theme.ColorInLoginPage


@Composable
fun TextFormFieldUsed(
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Text,
    value: String,
    autoCorrectness: Boolean = true,
    @DrawableRes leadingIcon:Int,
    singleLine: Boolean = true,
    labelText: String,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onValueChange: (String) -> Unit,
    focusManager : FocusManager = LocalFocusManager.current
) {
    OutlinedTextField(
        modifier = modifier
            .padding(horizontal = 15.dp, vertical = 3.dp)
            .fillMaxWidth(),
        value = value,
        visualTransformation = visualTransformation,
        keyboardOptions = KeyboardOptions.Default.copy(
            autoCorrect = autoCorrectness,
            keyboardType = keyboardType,
            imeAction = ImeAction.Done,
            ),
        keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() }),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            cursorColor = ColorInLoginPage,
            focusedBorderColor = ColorInLoginPage,
            unfocusedBorderColor = ColorInLoginPage,
            unfocusedLabelColor = ColorInLoginPage,

        ),
        onValueChange = onValueChange,
        shape = RoundedCornerShape(25.dp),
        singleLine = singleLine,
        label = { Text(text = labelText, style = TextStyle(fontSize = 17.sp, color = ColorInLoginPage)) },
        leadingIcon = { Icon(
            painter =
        painterResource(id = leadingIcon),
            contentDescription = null,
        ) },
        textStyle = TextStyle(fontSize = 20.sp),
    )
}