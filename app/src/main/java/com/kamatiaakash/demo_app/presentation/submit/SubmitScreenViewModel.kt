package com.kamatiaakash.demo_app.presentation.submit

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SubmitScreenViewModel:ViewModel() {

    private val _state = mutableStateOf(SubmitScreenState())
    val state:State<SubmitScreenState> = _state

    val imageTypes:List<String> =
        listOf(
            "Disease Related",
            "Insect Related",
            "Other"
        )

    fun onMenuItemClicked(index:Int,selectedItem:String){
        _state.value = state.value.copy(
            indexSelected = index,
            isDropDownExpanded = false,
            selectedType = selectedItem
        )
    }

    fun toggleDropDown(){
        val expanded = state.value.isDropDownExpanded
        _state.value = state.value.copy(
            isDropDownExpanded = !expanded
        )
    }

    fun onDropDownDismiss(expanded:Boolean){
        _state.value = state.value.copy(
            isDropDownExpanded = expanded
        )
    }


}