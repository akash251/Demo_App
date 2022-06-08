package com.kamatiaakash.demo_app.presentation.authentication

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AuthScreenViewModel:ViewModel() {

    private val _state = mutableStateOf(AuthScreenState())
    val state:State<AuthScreenState> = _state

    fun onEmailValueChange(email:String){
        _state.value = state.value.copy(
            email = email
        )
    }

    fun onPasswordValueChange(password:String){
        _state.value = state.value.copy(
            password = password
        )
    }
}