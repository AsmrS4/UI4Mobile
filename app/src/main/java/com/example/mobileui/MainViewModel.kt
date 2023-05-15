package com.example.mobileui

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

    var isCurrentlyDragging by mutableStateOf(false)
        private set

    var items by mutableStateOf(emptyList<BlockUiItem>())
        private set

    var addedBlocks = mutableStateListOf<BlockUiItem>()
        private set

    init {
        items = listOf(
            BlockUiItem("Assingment", Color.Gray),
            BlockUiItem("Input", Color.Blue),
            BlockUiItem("Operations", Color.Green),
            BlockUiItem("Variable", Color.Red),
            BlockUiItem("Print", Color.Magenta),
            BlockUiItem("Conditions", Color.Cyan),
        )
    }

    fun startDragging(){
        isCurrentlyDragging = true
    }
    fun stopDragging(){
        isCurrentlyDragging = false
    }

    fun addBlock(blockUiItem: BlockUiItem){
        println("Added Blocks")
        addedBlocks.add(blockUiItem)
    }

}
