package com.kamatiaakash.demo_app.presentation.submit

data class SubmitScreenState(
    val indexSelected:Int = 0,
    val isDropDownExpanded:Boolean = false,
    val selectedType:String = "Choose type"
)
